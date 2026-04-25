package Desafio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Exercise> exercicios = new ArrayList<>();

        exercicios.add(new DynamicExercise("Pull-up", "Costas", 3, 10));
        exercicios.add(new StaticExercise("L-site", "Core", 30));

        for (Exercise ex : exercicios) {
            ex.logProgress();
        }
    }
}
