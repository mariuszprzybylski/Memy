package pl.akademiakodu.memy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifStaticDao;
import pl.akademiakodu.memy.model.Gif;
import pl.akademiakodu.memy.model.Search;

import javax.swing.*;

@Controller
public class GifController {


    private GifDao gifDao = new GifStaticDao();

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }


    @GetMapping("/favorites")
    public String findFavorites(ModelMap modelMap) {
        modelMap.put("mems", gifDao.findAllFavorites());
        return "favorites";
    }

    @GetMapping("/search")
    public String searchAll (@ModelAttribute Search search, ModelMap modelMap) {
        modelMap.put("search",search.search(gifDao.findAll(), search.getQ()));
        return "home";
    }
}
