package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifStaticDao implements GifDao {

   List<Gif> gifs = new ArrayList<>();


    @Override
    public List<Gif> findAll() {
        return gifs;
    }

    @Override
    public void addMem(Gif gif) {

    }

    @Override
    public List<Gif> findAllFavorites() {
        return null;
    }
}
