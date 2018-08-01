package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryStaticDao implements CategoryDao {

   private static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category(1,"Android"));
        categories.add(new Category(2,"Funny"));
        categories.add(new Category(3,"Programming"));


    }

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void addGif() {
    }

    @Override
    public List<Category> findById() {
        return null;
    }
}
