package ejercicio_2;

public class Vehiculo {
    private static int vehiculosTotales = 0;
    private static int kilometrosTotales = 0;
    
    private int kilometrosRecorridos;

    // constructor
    public Vehiculo(){
        vehiculosTotales++;
        kilometrosRecorridos = 0;
    }

    // añadir kilometors
    public void setKilometros(int numero){
        kilometrosRecorridos += numero; // los concretos
        kilometrosTotales += numero; // los totales
    }

    // kilometros del objeto
    public int getKilometrosObj(){
        return this.kilometrosRecorridos;
    }

    
    ///// TOTALES /////
    // kilometros totales
    public static int getKilometrosTot(){
        return kilometrosTotales;
    }

    // dice los vehiculos creados
    public int getVehiculos() {
        return vehiculosTotales;
    }
}