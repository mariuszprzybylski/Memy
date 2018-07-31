package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifStaticDao implements GifDao {

   public static List<Gif> gifs = new ArrayList<>();


    @Override
    public List<Gif> findAll() {
        gifs.add(1,);
        return gifs;
    }

    @Override
    public void addMem(Gif gif) {

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
