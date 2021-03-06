package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

public interface GifDao {

    public List<Gif> findAll();


    List<Gif> findAllFavorites();

    Gif findByName(String name);

    public void toggleGif(int id);

    public Gif findById(int id);


}