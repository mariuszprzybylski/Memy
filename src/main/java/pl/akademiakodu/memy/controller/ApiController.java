package pl.akademiakodu.memy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.memy.dao.CategoryDao;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifStaticDao;
import pl.akademiakodu.memy.model.Categories;
import pl.akademiakodu.memy.model.Gif;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

    private static GifDao gifDao = new GifStaticDao();

    @GetMapping("/gifs")
    public Iterable<Gif> all() {
        return gifDao.findAll();
    }

//    @GetMapping("/category/{id}")
//    public Categories show(@PathVariable Integer id) {
//        return CategoryDao.findAll().stream().filter(p -> p.getId() == id).findFirst().get();
//    }
}

