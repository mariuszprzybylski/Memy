package pl.akademiakodu.memy.model;

public class Gif {

    private Integer id;
    private String name;
    private boolean favorite;
    private Category category;
    private String userName;

    public Gif(Integer id, String name, boolean favorite, Category category, String userName) {
        this.id = id;
        this.name = name;
        this.favorite = favorite;
        this.category = category;
        this.userName = userName;
    }

    public Gif() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Gif{" +
                "category=" + category +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", favorite=" + favorite +
                ", userName='" + userName + '\'' +
                '}';
    }
}
