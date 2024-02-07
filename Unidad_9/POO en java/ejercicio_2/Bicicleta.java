package ejercicio_2;

public class Bicicleta extends Vehiculo {

    public Bicicleta() {
        super();
    }

    public void pedalear() {
        System.out.print("¿Cuanto andas con la bicicleta? = ");
        setKilometros(Integer.parseInt(System.console().readLine()));
    }

    public void caballito() {
        System.out.print("¿Cuanto dura tu caballito con la bicicleta? = ");
        setKilometros(Integer.parseInt(System.console().readLine()));
        System.out.println("Caballitooo");
    }

    public int kilometrosBici() {
        return getKilometrosObj();
    }
}
