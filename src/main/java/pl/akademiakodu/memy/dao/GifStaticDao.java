package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;
import sun.net.www.content.image.gif;

import java.util.ArrayList;
import java.util.List;

public class GifStaticDao implements GifDao {


    public static List<Gif> gifs = new ArrayList<>();


    static {

        List<Category> categories = new CategoryStaticDao().findAll();
        gifs.add(new Gif(1, "gifs/android-explosion.gif", true, categories.get(0), "User1"));
        gifs.add(new Gif(2, "gifs/ben-and-mike.gif", false, categories.get(1), "User2"));
        gifs.add(new Gif(3, "gifs/book-dominos.gif", false, categories.get(2), "User3"));
        gifs.add(new Gif(4, "gifs/compiler-bot.gif", true, categories.get(2), "User4"));
        gifs.add(new Gif(5, "gifs/cowboy-coder.gif", false, categories.get(2), "User5"));
        gifs.add(new Gif(6, "gifs/infinite-andrew.gif", true, categories.get(1), "User6"));

    }

    public List<Gif> findAll() {
        return gifs;
    }


    @Override
    public List<Gif> findAllFavorites() {

        List<Gif> favGif = new ArrayList<>();
        for (Gif gifList : gifs) {
            if (gifList.isFavorite() == true) {
                favGif.add(gifList);
            }
        }
        return favGif;
    }

    @Override
    public Gif findByName(String name) {
        return gifs.stream().filter(gif -> gif.getUserName().equals(name)).findFirst().get();
    }

}

