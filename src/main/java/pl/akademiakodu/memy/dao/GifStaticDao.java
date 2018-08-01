package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;
import sun.net.www.content.image.gif;

import java.util.ArrayList;
import java.util.List;

public class GifStaticDao implements GifDao {


    private static List<Gif> gifs = new ArrayList<>();

    static {

        gifs.add(new Gif(1, "gifs/android-explosion.gif", true, "User1"));
        gifs.add(new Gif(2, "gifs/ben-and-mike.gif", false, "User2"));
        gifs.add(new Gif(3, "gifs/book-dominos.gif", false, "User3"));
        gifs.add(new Gif(4, "gifs/compiler-bot.gif", true, "User4"));
        gifs.add(new Gif(5, "gifs/cowboy-coder.gif", false, "User5"));
        gifs.add(new Gif(6, "gifs/infinite-andrew.gif", true, "User6"));
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
    public Gif findByName(String name){
        return gifs.stream().filter(gif -> gif.getUserName().equals(name)).findFirst().get();
    }

}

