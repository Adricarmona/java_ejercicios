package ejercicio_6.src;

public class TestTiempo {
    public static void main(String[] args) {
        Tiempo dia = new Tiempo(4, 20, 30);
        dia.suma(2, 39, 30);
        System.out.println(dia);
        dia.resta(6, 1, 1);
        System.out.println(dia);

        Tiempo error = new Tiempo(1, 65, 2);
        System.out.println(error);

        Tiempo cero = new Tiempo(0, -1, 0);
        System.out.println(cero);
        cero.suma(10, 10, 10);
        System.out.println(cero);
        cero.suma(-1, 0, 0);
        System.err.println(cero);
    }
}
