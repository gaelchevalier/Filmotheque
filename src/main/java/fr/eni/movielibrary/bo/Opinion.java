package fr.eni.movielibrary.bo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Opinion {
    private long id;

    @NotBlank
    @Min(0)
    @Max(5)
    private int note;

    @NotBlank
    @Size(min = 1, max = 250)
    private String comment;

    private Member member;
    private Movie movie;

    // Constructeurs
    public Opinion() {
    }
    public Opinion(long id, int note, String comment) {
        this.id = id;
        this.note = note;
        this.comment = comment;
    }

    // Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Opinion{");
        sb.append("id=").append(id);
        sb.append(", note=").append(note);
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", member=").append(member);
        sb.append(", movie=").append(movie);
        sb.append('}');
        return sb.toString();
    }
}
