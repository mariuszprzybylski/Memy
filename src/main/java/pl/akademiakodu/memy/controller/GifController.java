package pl.akademiakodu.memy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifStaticDao;

@Controller
public class GifController {


    private GifDao gifDao = new GifStaticDao();

    @GetMapping("/")
    public String home(){
        return "home";
    }



    @GetMapping ("/favorites")
    public String findFavorites (ModelMap modelMap) {
        modelMap.put("mems", gifDao.findAllFavorites());
        return "favorites";
    }
}