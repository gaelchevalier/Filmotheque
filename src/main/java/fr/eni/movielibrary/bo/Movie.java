package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {
    private long id;
    private String title;
    private int year;
    private int duration;
    private String synopsis;

    private Genre genre;

    private Participant director;
    private List<Participant> actors;

    // Constructeur
    public Movie() {
    }

    public Movie(long id, String title, int year, int duration, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
    }
    public Movie(long id, String title, int year, int duration, Genre genre, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Participant getDirector() {
        return director;
    }

    public void setDirector(Participant director) {
        this.director = director;
    }

    public List<Participant> getActors() {
        return actors;
    }

    public void setActors(List<Participant> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", synopsis='" + synopsis + '\'' +
                ", genre=" + genre +
                ", director=" + director +
                ", actors=" + actors +
                '}';
    }

}
