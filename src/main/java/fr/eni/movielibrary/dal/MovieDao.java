package fr.eni.movielibrary.dal;

import fr.eni.movielibrary.bo.Movie;

import java.util.List;

public interface MovieDao {

    public Movie findById(long id);
    public List<Movie> getAllMovies();
}
