package fr.eni.movielibrary.bo;

public class Genre {
    private int id;
    private String label;

    // Constructeurs
    public Genre() {
    }

    public Genre(String label) {
        this.label = label;
    }


    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
