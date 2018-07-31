package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.List;

public interface GifDao  {

    List<Gif> findAll();

    void addGif(Gif gif);

    List<Gif> findAllFavorites();

}