public class Libreto {
    private int identificador, anyoPublicacion;
    private String titulo;

    /**
     * El constructor metiendole datos
     * @param identificador: El identificador del libro
     * @param anyoPublicacion: El año de publicacion del libro
     * @param titulo: El titulo del libro
     */
    public Libreto(int identificador, int anyoPublicacion, String titulo) {
        setIdentificador(identificador);;
        setAnyoPublicacion(anyoPublicacion);;
        setTitulo(titulo);;
    }


/*      Setters && Getters       */

    /**
     * @return: Devuelve el identificador de los libretos
     */
    public int getIdentificador() {
        return identificador;
    }


    /**
     * Setter para meter el identificador en su dato privado
     * @param identificador: El indentificador a meter al libro
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }


    /**
     * @return: Devuelve al año de publicacion del libreto
     */
    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }


    /**
     * @param anoPublicacion: Mete el año de publicacion del libreto a el dato privado
     */
    public void setAnyoPublicacion(int anoPublicacion) {
        this.anyoPublicacion = anoPublicacion;
    }


    /**
     * @return: Devuelve el titulo del libreto
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo: Añade el titulo del libro al dato privado
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


/*      El metodo ToString       */
    @Override
    public String toString() {
        return "Libreto => Identificador ->"+identificador+", Año Publicacion ->"+anyoPublicacion+", Titulo -> "+titulo;
    }
}
