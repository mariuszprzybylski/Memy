package pl.akademiakodu.memy.dao;

import pl.akademiakodu.memy.model.Category;

import java.util.ArrayList;
import java.util.List;

public interface CategoryDao {

    List<Category> categories = new ArrayList<>();

    List<Category> findAll();
    void addGif ();
    List<Category> findById();
}
