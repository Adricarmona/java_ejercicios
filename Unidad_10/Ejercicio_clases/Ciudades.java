import java.util.ArrayList;
import java.util.HashMap;

public class Ciudades {
    HashMap<String, ArrayList<Integer>> ciudades;
    ArrayList<Integer> codigo;

    // Constructores
    public Ciudades(String ciudadesNombre, int postal) {
        ciudades = new HashMap<String, ArrayList<Integer>>();
        codigo = new ArrayList<Integer>();
        codigo.add(postal);
        ciudades.put(ciudadesNombre.toLowerCase(), codigo);
    }

    public Ciudades(String ciudadesNombre) {
        ciudades = new HashMap<String, ArrayList<Integer>>();
        codigo = new ArrayList<Integer>();
        ciudades.put(ciudadesNombre.toLowerCase(), codigo);
    }

    // sentencias
    public void anadirPostal(String ciudad ,int postal) {
        codigo = ciudades.get(ciudad.toLowerCase());
        codigo.add(postal);
    }

    public void anadirCiudad(String nombre){
        codigo = new ArrayList<Integer>();
        ciudades.put(nombre.toLowerCase() , codigo);
    }

    public void anadirCiudad(String nombre, int postal){
        codigo = new ArrayList<Integer>();
        ciudades.put(nombre.toLowerCase() , codigo);
        anadirPostal(nombre.toLowerCase(), postal);
    }

    public void quitarPostal(String nombre){
        if (ciudades.containsKey(nombre.toLowerCase())) {
            codigo = ciudades.get(nombre.toLowerCase());
            codigo.clear();
        } else {
            System.out.println("No existe esa ciudad");
        }
    }

    public void quitarPostalConcreto(String nombre, int numero ){
        if (ciudades.containsKey(nombre.toLowerCase())) {
            codigo = ciudades.get(nombre.toLowerCase());
            codigo.remove(numero);
        } else {
            System.out.println("No existe esa ciudad");
        }
    }

    public void quitarCiudad(String nombre){
        if (ciudades.containsKey(nombre.toLowerCase())) {
            ciudades.remove(nombre.toLowerCase());
        } else {
            System.out.println("No existe esa ciudad");
        }
    }

    // to string
    @Override
    public String toString() {
        return ciudades+"";
    }
}
