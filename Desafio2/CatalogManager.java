package Desafio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogManager {
    private Map<Manga, List<Integer>> readChapters = new HashMap<>();

    public void addChapter(Manga manga, int chapterNumber) {
        readChapters.computeIfAbsent(manga, k -> new ArrayList<>()).add(chapterNumber);
    }

    public List<Integer> getReadChapters(Manga manga) {
    return readChapters.get(manga);
}
}