package fr.eni.movielibrary.bll.jpa;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bll.ServiceResult;
import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Opinion;
import fr.eni.movielibrary.bo.Participant;
import fr.eni.movielibrary.dal.jpa.MovieDaoJpaImpl;
import fr.eni.movielibrary.dal.jpa.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("prod")
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieDaoJpaImpl movieDaoJpa;

    @Override
    public List<Movie> getAllMovies() {
        return movieDaoJpa.getAllMovies();
    }

    @Override
    public Movie getMovieById(long id) {
        return movieDaoJpa.findById(id);
    }

    @Override
    public List<Genre> getGenres() {
        return null;
    }

    @Override
    public List<Participant> getParticipants() {
        return null;
    }

    @Override
    public Genre getGenreById(long id) {
        return null;
    }

    @Override
    public Participant getParticipantById(long id) {
        return null;
    }

    @Override
    public void saveMovie(Movie movie) {

    }

    @Override
    public ServiceResult addMovie(Movie movie) {
        return null;
    }

    @Override
    public ServiceResult addOpinion(Opinion opinion, long movieId) {
        return null;
    }
}
