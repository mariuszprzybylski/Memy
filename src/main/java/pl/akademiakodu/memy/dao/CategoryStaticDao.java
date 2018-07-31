package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryStaticDao implements CategoryDao {

   private static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category(1,"android"));
        categories.add(new Category(2,"funny"));
        categories.add(new Category(3,"programming"));


    }

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void addGif() {
    }
}
