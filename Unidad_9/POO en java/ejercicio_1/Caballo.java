package ejercicio_1;

/**
 * Caballo
 */
public class Caballo {

    String nombre;
    String raza;
    String sangre;
    int edad;
    String color;

    public Caballo(String n){
        this.nombre = n;
    }

    void relincha(){
        System.out.println("*relincha*");
    }

    void rebuzna(){
        System.out.println("*Rebuzna*");
    }

    void patalea(){
        System.out.println("*patalea*");
    }
}