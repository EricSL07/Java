package Desafio1;

abstract class Exercise implements Trackable {
    private final String nome;
    private final String grupoMuscular;

    public Exercise(String nome, String grupoMuscular) {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
    }

    public String getNome() {
        return nome;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

}