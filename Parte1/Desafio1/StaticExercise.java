package Desafio1;

public class StaticExercise extends Exercise {
    private final int holdTimeSeconds;

    public StaticExercise(String nome, String grupoMuscular, int holdTimeSeconds) {
        super(nome, grupoMuscular);

        this.holdTimeSeconds = holdTimeSeconds;
    }

    public int getHoldTimeSeconds() {
        return holdTimeSeconds;
    }

    @Override
    public void logProgress() {
        System.out.printf(getNome() + "segurar por: " + holdTimeSeconds);
    }
}
