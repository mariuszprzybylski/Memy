package pl.akademiakodu.memy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.memy.dao.CategoryDao;
import pl.akademiakodu.memy.dao.CategoryStaticDao;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifStaticDao;
import pl.akademiakodu.memy.model.Categories;
import pl.akademiakodu.memy.model.Gif;
import pl.akademiakodu.memy.model.Search;


@Controller
public class GifController {


    private GifDao gifDao = new GifStaticDao();
    private CategoryDao categoryDao = new CategoryStaticDao();

    @GetMapping("/")
    public String home(ModelMap modelMap, Gif gif) {
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/search")
    public String searchAll(@ModelAttribute Search search, ModelMap modelMap) {
        modelMap.put("gifs", search.search(gifDao.findAll(), search.getQ()));
        if (search.search(gifDao.findAll(), search.getQ()).size() == 0) {
            modelMap.put("alert", "Nie ma takiego gifa");
        }
        return "home";
    }

    @GetMapping("/favorites")
    public String findFavorites(ModelMap modelMap) {

        modelMap.put("favs", gifDao.findAllFavorites());
        return "favorites";
    }

    @GetMapping("/home/{userName}")
    public String useerName(@PathVariable String userName, ModelMap modelMap) {
        modelMap.put("gif", gifDao.findByName(userName));
        return "/gif-details";
    }

    @GetMapping("/categories")
    public String showCategories(ModelMap modelMap) {
        modelMap.put("categories", categoryDao.findAll());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String show(@PathVariable int id, ModelMap modelMap) {
        modelMap.put("gifs", Categories.findByCategories(gifDao.findAll(), id));
        modelMap.put("category", CategoryStaticDao.findByCategoryId(id));
        return "category";
    }
}
