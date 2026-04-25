package Desafio4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Bodybuilder> atletas = new ArrayList<>();

        atletas.add(new Bodybuilder("Chris Bumstead", "Classic Physique", 104.5));
        atletas.add(new Bodybuilder("Ramon Dino", "Classic Physique", 101.0));
        atletas.add(new Bodybuilder("Derek Lunsford", "Open", 115.0));
        atletas.add(new Bodybuilder("Hadi Choopan", "Open", 114.0));
        atletas.add(new Bodybuilder("Ryan Terry", "Men's Physique", 85.0));

        FiltrarAtletas(atletas);
        mediaPesoOpen(atletas);
        optionalRamon(atletas);

    }

    public static void FiltrarAtletas(List<Bodybuilder> classic) {
        classic.stream()
            .filter(a -> a.category().equals("Classic Physique"))
            .map(Bodybuilder::name)
            .forEach(System.out::println);;
    }

    public static void mediaPesoOpen(List<Bodybuilder> open) {
        double media = open.stream()
            .mapToDouble(Bodybuilder::weightKg)
            .average()
            .orElse(0.0);

        System.out.println("Média de peso: " + media);
    }

    public static void optionalRamon(List<Bodybuilder> todos) {
        todos.stream()
            .filter(a -> a.name().equals("Ramon Dino"))
            .findFirst()
            .ifPresentOrElse(
                a -> System.err.println("Encontrado " + a.name()),
                () -> System.err.println("Ramon Dino não econtrrado")
            );
    }

}
