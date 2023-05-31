package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Opinion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes({"loggedMember"})
public class OpinionController {

    MovieService movieService;

    @Autowired
    public OpinionController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/add-opinion/{movieId}")
    public String addOpinion(@PathVariable("movieId") long movieId, Model model) {
        model.getAttribute("loggedMember");

        Movie relatedMovie = movieService.getMovieById(movieId);
        model.addAttribute("opinion", new Opinion());

        model.addAttribute("relatedMovie", relatedMovie);

        return "opinion/add-opinion";
    }

    @PostMapping("/add-opinion/{movieId}")
    public String addOpinionAction(
            @ModelAttribute("opinion") Opinion opinion,
            @PathVariable("movieId") long movieId,
            Model model) {
        model.getAttribute("loggedMember");
//        model.addAttribute("opinion", new Opinion());

        return "opinion/add-opinion";
    }
}
