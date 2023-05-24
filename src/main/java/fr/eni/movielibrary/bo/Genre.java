package fr.eni.movielibrary.bo;

public class Genre {
    private long id;
    private String label;

    // Constructeurs
    public Genre() {
    }

    public Genre(long id, String label) {
        this.id = id;
        this.label = label;
    }


    // Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Genre{");
        sb.append("id=").append(id);
        sb.append(", label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
