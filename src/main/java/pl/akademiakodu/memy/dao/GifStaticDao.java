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
        gifs.add(new Gif(1, "gifs/android-explosion.gif",true,categories.get(0)));
        gifs.add(new Gif(2, "gifs/ben-and-mike.gif",false,categories.get(1)));
        gifs.add(new Gif(3, "gifs/book-dominos.gif",false,categories.get(2)));
        gifs.add(new Gif(4, "gifs/compiler-bot.gif",true,categories.get(2)));
        gifs.add(new Gif(5, "gifs/cowboy-coder.gif",false,categories.get(2)));
        gifs.add(new Gif(6, "gifs/infinite-andrew.gif",true,categories.get(1)));

    }

    public List<Gif> findAll() {
        return gifs;
    }
    @Override
    public void addGif(Gif gif) {

        gifs.add(gif);

    }

    @Override
    public List<Gif> findAllFavorites() {
        List<Gif> favgif = new ArrayList<>();

        for (Gif gif: gifs) {

            if ((gif.isFavorite() == true)) {
                favgif.add(gif);
            }
        }
        return favgif;
    }



}

