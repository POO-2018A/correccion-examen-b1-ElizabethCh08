public class Autor {


    private String nombre;
    private String pais;
    private Libro[] libros;

    public Autor(String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }


}
