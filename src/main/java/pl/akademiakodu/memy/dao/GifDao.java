package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

public interface GifDao  {

    public List<Gif> findAll();

    void addMem(Gif gif);

    List<Gif> findAllFavorites();
}