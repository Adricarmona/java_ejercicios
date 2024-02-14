public class App {
    public static void main(String[] args) throws Exception {
        ColeccionDedDiscos[] coleccion = new ColeccionDedDiscos[2];
        coleccion[0] = new ColeccionDedDiscos(Generos.rock);
        coleccion[1] = new ColeccionDedDiscos(Generos.rock);
        System.err.println(coleccion[0].getCantidadDiscos());
    }
}
