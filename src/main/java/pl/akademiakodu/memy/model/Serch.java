package pl.akademiakodu.memy.model;

import java.util.ArrayList;
import java.util.List;

public class Serch {

    public List<Gif> search(List<Gif> gifList, String word) {

        List<Gif> search = new ArrayList<>();
        for (Gif serchList : gifList) {
            if (serchList.getName().contains(word)) {
            }
        }
        return search;
    }
}