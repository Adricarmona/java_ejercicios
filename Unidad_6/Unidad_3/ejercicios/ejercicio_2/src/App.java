import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double euros;
        double pesetas;
        double resultado;

        Scanner s = new Scanner(System.in);

        // datos5
        System.out.printf("Escriba la cantidad de euros que quiera pasar a pesetas \n--> ");
        euros = s.nextDouble();
        pesetas =166.3860; // valor de 1 euro

        // conversor
        resultado = euros * pesetas;
        System.out.printf("--> son %d pesetas \n", (int)resultado);
        s.close();
    }
}