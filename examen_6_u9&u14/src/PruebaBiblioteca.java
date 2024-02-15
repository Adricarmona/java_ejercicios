public class PruebaBiblioteca {
    public static void main(String[] args) {
        // generamos 3 librillos
        Libro[] librillos = new Libro[3];
        // le añadimos valores a los 3 librillos
        librillos[0] = new Libro("1ero", 2024);
        librillos[1] = new Libro("2gundo", "motos rapidas", 2013);
        librillos[2] = new Libro("3ero", "ladrillos y sus consecuencias", 1680);
        // prestamos y devolvemos los libros
        librillos[0].presta();
        librillos[0].devuelve();
        librillos[1].presta();

        // mostramos los librillos por pantalla
        for (int i = 0; i < librillos.length; i++) {
            System.out.println(librillos[i]);
        }
    }
}
