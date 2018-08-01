package pl.akademiakodu.memy.controller;


import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.memy.dao.CategoryDao;
import pl.akademiakodu.memy.dao.CategoryStaticDao;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifStaticDao;
import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

import java.util.List;

@Controller
public class GifController {


    private GifDao gifDao = new GifStaticDao();
    private CategoryDao categoryDao = new CategoryStaticDao();


    @GetMapping("/")
    public String home(ModelMap modelMap, Gif gif){
        modelMap.put("gifs",gifDao.findAll());
        return "home";
    }

    @GetMapping("/api/posts")
    public Iterable<Gif> all() {
        return gifDao.findAll();
    }


    @GetMapping ("/favorites")
    public String findFavorites (ModelMap modelMap) {
        modelMap.put("favs", gifDao.findAllFavorites());
        return "favorites";
    }

    @GetMapping ("/categories")
    public String showCategories (ModelMap modelMap) {
       modelMap.put("categories",categoryDao.findAll());
       return "categories";
    }

    @GetMapping ("/category/{id}")
    public String show (@PathVariable int id, ModelMap modelMap) {
    modelMap.addAttribute("gif",categoryDao.findById());
    return "category";
    }



}