/**
 * Testeo
 */
public class Testeo {

    public static void main(String[] args) {
        Ciudades ciudades = new Ciudades("Madrid", 28080);
        /*ciudades.anadirPostal("Madrid",289090);
        System.out.println(ciudades);*/

        ciudades.anadirCiudad("Malaga");/*
        ciudades.anadirPostal("Malaga",8888);
        ciudades.anadirPostal("Malaga",8881);
        System.out.println(ciudades);

        ciudades.quitarCiudad("Madrid");
        ciudades.quitarPostal("Malaga");
        System.out.println(ciudades);

        ciudades.anadirCiudad("Valencia",24524);
        System.out.println(ciudades);

        ciudades.quitarCiudad("Madrid");
        ciudades.quitarPostal("Madrid");

        System.out.println(ciudades);*/

        ciudades.anadirPostal("Malaga",8888);
        ciudades.anadirPostal("Malaga",8888);
        ciudades.anadirPostal("Valencia", 299);
        System.out.println(ciudades);
    }
}