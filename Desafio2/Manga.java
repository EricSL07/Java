package Desafio2;

 public class Manga {
    private final String titulo;
    private final String autor;

    public Manga(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Manga other = (Manga) obj;
        return titulo.equals(other.titulo);

    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return titulo.hashCode();
    }
}
