public class ColeccionDedDiscos {
    private static int cantidadDiscos;
    private String nombre;
    private Generos genero;

    public ColeccionDedDiscos(Generos g) {
        setCantidadDiscos(1);
        setNombre(System.console().readLine());
        setGenero(g);
    }

    // cantidad discos
    public static int getCantidadDiscos() {
        return cantidadDiscos;
    }

    public static void setCantidadDiscos(int cantidadDiscos) {
        ColeccionDedDiscos.cantidadDiscos += cantidadDiscos;
    }

    // el nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // genero
    public Generos getGenero() {
        return genero;
    }
    public void setGenero(Generos g) {
        genero = g;
    }
}
