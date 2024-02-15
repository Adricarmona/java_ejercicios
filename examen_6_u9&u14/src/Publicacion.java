/**
 * Publicacion
 */
public abstract class Publicacion {
    private int anyoPublicacion;
    private String titulo;
    
    // constructor
    public Publicacion(String tituloI, int ano) {
        setAnyoPublicacion(ano);
        setTitulo(tituloI);
    }

    /**
     * @return: devuelve el nombre del titutlo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo: El titulo a meterle en el libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    /**
     * @return: devuelve el año de publicacion de el libro
     */
    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    /**
     * @param anyoPublicacion: Ingresa el año de publicacion del libro
     */
    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    // El metodo toString
    @Override
    public String toString() {
        return "Publicacion [anyoPublicacion=" + anyoPublicacion + ", titulo=" + titulo + "]";
    }
}