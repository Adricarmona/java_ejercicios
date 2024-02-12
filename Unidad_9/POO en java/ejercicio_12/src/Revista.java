public class Revista extends Publicacion implements Presentable{
    private String codigo,nombre;
    private int numero;
    private boolean prestado;

    Revista(String codigoI, String nombreI, int añoI, int numeroI){
        codigo = codigoI;
        nombre = nombreI;
        numero = numeroI;
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
            return "ISBN: "+codigo+", título: "+nombre+", año de publicación: "+getAño();
        } else {
            return "ISBN: "+codigo+", título: "+nombre+", año de publicación: "+getAño();
        }
    }
}
