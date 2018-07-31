package pl.akademiakodu.memy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GifController {


    private GifDao gifDao = new GifStaticDao();

    @GetMapping("/")
    public String home(){
        return "home";
    }

}

    @GetMapping ("/favorites")
    public String findFavorites (ModelMap modelMap) {
        modelMap.put("mems", gifDao.findFavorites());
        return "favorites";
    }
