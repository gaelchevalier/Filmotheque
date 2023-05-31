package fr.eni.movielibrary.bll;

import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Opinion;
import fr.eni.movielibrary.bo.Participant;

import java.util.List;

public interface MovieService {

    public List<Movie> getAllMovies();
    public Movie getMovieById(long id);
    public List<Genre> getGenres();
    public List<Participant> getParticipants();
    public Genre getGenreById(long id);
    public Participant getParticipantById(long id);
    public void saveMovie(Movie movie);
    public ServiceResult addMovie(Movie movie);
    public ServiceResult addOpinion(Opinion opinion, long movieId);

}

