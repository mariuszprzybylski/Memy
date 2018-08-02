package pl.akademiakodu.memy.controller;


import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.memy.dao.CategoryDao;
import pl.akademiakodu.memy.dao.CategoryStaticDao;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifStaticDao;
import pl.akademiakodu.memy.model.Categories;
import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

    private static GifDao gifDao = new GifStaticDao();
    private static CategoryDao categoryDao = new CategoryStaticDao();

    @GetMapping("/gifs")
    public Iterable<Gif> all() {
        return gifDao.findAll();
    }

    @GetMapping("/category/{id}")
    public Category show(@PathVariable Integer id) {
        return CategoryStaticDao.findAll1().stream().filter(c -> c.getId() == id).findFirst().get();
    }


    @GetMapping("gif")
    public String showGif (@RequestParam Integer id) {
        GifStaticDao gifStaticDao = new GifStaticDao();
        gifStaticDao.toggleGif(id);
        return "ok";
    }

    @GetMapping("/categories")
    public Iterable<Category> allCategory() {
        return categoryDao.findAll();
    }
}