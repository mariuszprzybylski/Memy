package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static pl.akademiakodu.memy.dao.GifStaticDao.gifs;

public class CategoryStaticDao implements CategoryDao {


    private static List<Category> categories = new ArrayList<>();


    static {
        categories.add(new Category(1, "Android"));
        categories.add(new Category(2, "Funny"));
        categories.add(new Category(3, "Programming"));
    }

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void addGif() {
    }

    public static Category findByCategoryId(Integer id) {
        return categories.stream().filter(c -> c.getId() == id).findFirst().get();
    }
}


