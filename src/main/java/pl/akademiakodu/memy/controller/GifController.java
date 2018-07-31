package pl.akademiakodu.memy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.memy.dao.GifDao;
import pl.akademiakodu.memy.dao.GifStaticDao;
import pl.akademiakodu.memy.model.Gif;

@Controller
public class GifController {


    private GifDao gifDao = new GifStaticDao();

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/all")
    public String addGif(@ModelAttribute Gif gif, ModelMap modelMap){
        gifDao.addGit(gif);
        modelMap.put("gifs",gif);
        return "home";
    }



    @GetMapping ("/favorites")
    public String findFavorites (ModelMap modelMap) {
        modelMap.put("gifs", gifDao.findAllFavorites());
        return "favorites";
    }


}