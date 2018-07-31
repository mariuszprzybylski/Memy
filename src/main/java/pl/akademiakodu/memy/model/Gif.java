package pl.akademiakodu.memy.model;

public class Gif {

    private Integer id;
    private String name;
    private boolean favorite;


    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public Gif(Integer id, String name) {
        this.id = id;
        this.name = name;
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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
