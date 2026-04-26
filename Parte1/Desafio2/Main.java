package Desafio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogManager manager = new CatalogManager();

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga("One Piece", "Oda"));
        mangas.add(new Manga("Dragon Ball", "Akira Toriyama"));

        manager.addChapter(mangas.get(0), 1);
        manager.addChapter(mangas.get(0), 2);
        manager.addChapter(mangas.get(1), 2);
        
        Manga busca = new Manga("One Piece", "Oda"); 
        System.out.println("Capítulos lidos de One Piece: " + manager.getReadChapters(busca));

        Manga busca2 = new Manga("Dragon Ball", "Akira Toriyama");
        System.out.println("Capítulos lidos de " + busca2.getTitulo() + ":" + manager.getReadChapters(busca2));

    }
}
