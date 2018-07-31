package pl.akademiakodu.memy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
        modelMap.put("gifs", gifDao.findAllFavorites());
        return "favorites";
    }


}