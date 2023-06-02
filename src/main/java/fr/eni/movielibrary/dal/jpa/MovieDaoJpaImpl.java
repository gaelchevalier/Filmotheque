package fr.eni.movielibrary.dal.jpa;

import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.dal.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MovieDaoJpaImpl implements MovieDao {

    MovieRepository movieRepository;

    @Autowired
    public MovieDaoJpaImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie findById(long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        return movie.get();
    }

    @Override
    public List<Movie> getAllMovies() {
        Iterable<Movie> movies = movieRepository.findAll();
        return (List<Movie>) movies;
    }
}
