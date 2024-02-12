public class Libro extends Publicacion implements Presentable {
    private String codigo,nombre;
    
    private boolean prestado;

    Libro(String codigoI, String nombreI, int añoI){
        codigo = codigoI;
        nombre = nombreI;
        setAño(añoI);
    }

    @Override
    public boolean estaPrestado(){
        return prestado;
    }

    @Override
    public void devuelve() {
        prestado = false;
    };

    @Override
    public void presta() {
        prestado = true;
    };

    @Override
    public String toString() {
        if (estaPrestado()) {
            return "ISBN: "+codigo+", título: "+nombre+", año de publicación: "+getAño()+" (prestado)";
        } else {
            return "ISBN: "+codigo+", título: "+nombre+", año de publicación: "+getAño()+" (no prestado)";
        }
    }
}
