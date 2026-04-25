package Desafio1;

public class DynamicExercise extends Exercise{
    private final int sets;
    private final int reps;

    public DynamicExercise(String nome, String grupoMuscular, int sets, int reps) {
        super(nome, grupoMuscular);
        this.sets = sets;
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    @Override
    public void logProgress() {
        System.out.printf("%s (%s) - %d x %d%n", getNome(), getGrupoMuscular(), sets, reps);
    }
}
