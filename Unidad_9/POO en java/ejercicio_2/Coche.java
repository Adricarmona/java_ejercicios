package ejercicio_2;

public class Coche extends Vehiculo {

    public Coche(){
        super();
    } 

    public void quemarRueda(){
        System.out.println("*quema rueda*");
    }

    public void andarCoche(){
        System.out.print("Cantidad kilometros = ");
        setKilometros(Integer.parseInt(System.console().readLine()));
    }
}