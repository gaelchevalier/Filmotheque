package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MovieController {

    MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/movie-list")
    public String movieList(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "movie/movie-list";
    }

    // Movie details
    @GetMapping("/details/{id}")
    public String details(@PathVariable("id")long id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));
        return "movie/movie-details";
    }
}
