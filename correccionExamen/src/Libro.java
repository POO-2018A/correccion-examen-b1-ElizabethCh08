public class Libro {



    private String titulo;
    private Autor autor;
    private int anio;
    private boolean favorito;



    //Constructor

    public Libro(String titulo, int anio, boolean favorito, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.favorito = favorito;
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {

        return  "Titulo: " +titulo+ " Año: " + anio + " Autor: " + autor;
    }


}
