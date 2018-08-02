package pl.akademiakodu.memy.model;

import sun.net.www.content.image.gif;

import java.util.ArrayList;
import java.util.List;

public class Search {
    String q;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public List<Gif> searchGif(List<Gif> gifList, String word) {

        List<Gif> search = new ArrayList<>();
        for (Gif serchList : gifList) {
            if ((serchList.getName().contains(word))||(serchList.getCategory().getName().contains(word))) {
                search.add(serchList);
            }
        }
        return search;
    }

}