public class Animal {
    private String nombre;
    private String color;
    private int edad;

    Animal(String nom){
        this.nombre = nom;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int n){
        edad = n;
    }

    public String getNombre(){
        return nombre;
    }
}