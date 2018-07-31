package pl.akademiakodu.memy.model;

public class Gif {

    private String name;
    private boolean favorite;

    public Gif(String name, boolean favorite) {gi
        this.name = name;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
