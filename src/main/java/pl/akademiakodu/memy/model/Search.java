package pl.akademiakodu.memy.model;

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

    public List<Gif> search(List<Gif> gifList, String word) {

        List<Gif> search = new ArrayList<>();
        for (Gif serchList : gifList) {
            if (serchList.getName().contains(word)) {
                search.add(serchList);
            }
        }
        return search;
    }
}