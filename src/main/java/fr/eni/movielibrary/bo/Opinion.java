package fr.eni.movielibrary.bo;

public class Opinion {
    private Long id;
    private int note;
    private String comment;

    private Member member;
    private Movie movie;

    // Constructeurs
    public Opinion() {
    }
    public Opinion(Long id, int note, String comment) {
        this.id = id;
        this.note = note;
        this.comment = comment;
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
