package fr.eni.movielibrary.bo;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotBlank
    private String title;

    @Column(nullable = false)
    @Min(value = 1)
    private int year;

    @Column(nullable = false)
    @Min(value = 1)
    private int duration;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 20, max = 250)
    private String synopsis;


    @NotNull
    @ManyToOne()
    private Genre genre;

    @OneToMany()
    @JoinColumn(name = "movie_id")
    private List<Opinion> opinions;


    @NotNull
    @ManyToOne()
    private Participant director;

    @ManyToMany()
    private List<Participant> actors;

    // Constructeur
    public Movie() {
        opinions = new ArrayList<Opinion>();
    }

    public Movie(long id, String title, int year, int duration, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
        opinions = new ArrayList<Opinion>();
    }
    public Movie(long id, String title, int year, int duration, Genre genre, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public Movie(long id, String title, int year, int duration, String synopsis, Genre genre, Participant director, List<Participant> actors) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
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

    public List<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Opinion> opinions) {
        this.opinions = opinions;
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

    /**
     * Add an opinion
     * @param opinion
     */
    public void addOpinion(Opinion opinion) {
        opinions.add(opinion);
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
