public class Libro extends Publicacion implements Prestable{
    // atributos
    private String isbn;
    private boolean prestado = false;

    // Constructores
    Libro(String isbnIngresado, String titulo, int anyo){
        super(titulo, anyo); // nos metemos en el padre 
        setIsbn(isbnIngresado); // cambiamos el isbn
    }

    Libro(String isbnIngresado, int anyo){
        super("Sin título", anyo); // nos metemos en el padre 
        setIsbn(isbnIngresado); // cambiamos el isbn
    }

    @Override
    public void presta() {
        setPrestado(true);
    }

    @Override
    public void devuelve() {
        setPrestado(false);
    }

    @Override
    public boolean estaPrestado() {
        return isPrestado();
    }


    // SETERS Y GETTERS 
    /**
     * @return: devuelve el isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn: ingresa el isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return: deuvelve si esta entregado o no
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     * @param prestado: ingresa si esta presentado o no
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Metodo to String
    @Override
    public String toString() {
        if (isPrestado() == true) {
            return "Libro Año publicacion= "+getAnyoPublicacion()+", Titulo="+getTitulo()+", Isbn="+isbn+", Prestado= Si";
        }
        return "Libro Año publicacion= "+getAnyoPublicacion()+", Titulo="+getTitulo()+", Isbn="+isbn+", Prestado= No";
    }
}
