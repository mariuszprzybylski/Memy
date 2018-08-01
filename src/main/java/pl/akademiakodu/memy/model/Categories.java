package pl.akademiakodu.memy.model;

import pl.akademiakodu.memy.dao.GifStaticDao;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    public static List<Gif> findByCategories(List<Gif> gifList, int id)
    {
        List<Gif> Categorie = new ArrayList<>();
        for( Gif gif: gifList){
            if (gif.getCategory().getId()==(id)){
                Categorie.add(gif);
            }
        }
        return Categorie;
    }

}

