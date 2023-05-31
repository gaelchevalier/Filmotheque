package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bll.ServiceResult;
import fr.eni.movielibrary.bo.Member;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Opinion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes({"loggedMember"})
public class MovieController {

    MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.getAttribute("loggedMember");
        return "index";
    }

    @GetMapping("/movie-list")
    public String movieList(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        model.getAttribute("loggedMember");
        return "movie/movie-list";
    }

    // Movie details
    @GetMapping("/details/{id}")
    public String details(@PathVariable("id") long id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));
        model.addAttribute("opinion", new Opinion());
        model.getAttribute("loggedMember");
        return "movie/movie-details";
    }

    /**
     * Afichage du formulaire de création
     * @param model
     * @return
     */
    @GetMapping("/add-movie")
    public String addMovie(Model model) {

        if(model.getAttribute("loggedMember") == null) {
            return "redirect:/login";
        }

        model.addAttribute("movie", new Movie());
        model.addAttribute("genresOptions", movieService.getGenres());
        model.addAttribute("participantsOptions", movieService.getParticipants());
        return "movie/movie-add";
    }

    @PostMapping("/add-movie")
    public String addMovieAction(
            @Valid @ModelAttribute("movie") Movie movie,
            BindingResult bindingResult,
            Model model) {
        long newMovieId = movieService.getAllMovies().size() + 1;
        Movie newMovie = new Movie(
                newMovieId,
                movie.getTitle(),
                movie.getYear(),
                movie.getDuration(),
                movie.getSynopsis(),
                movie.getGenre(),
                movie.getDirector(),
                movie.getActors()
        );

        model.addAttribute("genresOptions", movieService.getGenres());
        model.addAttribute("participantsOptions", movieService.getParticipants());

        if (!bindingResult.hasErrors()) {

            // Appeler le service ajouter le film
            ServiceResult result = movieService.addMovie(newMovie);

            // Si le traitement est ok
            if (result.isValid()) {
                // Redirection
                return "redirect:/movie-list";
            }
            // Sinon
            // -- Envoyer le message d'erreur dans la vue
             model.addAttribute("errors", result.getErrors());
        }

        // -- Afficher le formulaire
        return "movie/movie-add";
    }

    @PostMapping("add-new-opinion/{id}")
    public String addOpinion(
            @PathVariable("id") int id,
            @Valid @ModelAttribute("opinion") Opinion opinion,
            BindingResult bindingResult,
            Model model) {

        if (!bindingResult.hasErrors()) {
            // Récupérer
            ServiceResult result = movieService.addOpinion(opinion, id);

            // Si on trouve le film
            if (result.isValid()) {

                // -- Redirigier sur le film
                return String.format("redirect:/details/%d", id);
            }
        }

        // Erreur
//        System.out.println(String.format("Erreurs : %s", result.getErrors()));

        return String.format("redirect:/");
    }
}
