import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // preguntas
        System.out.println("Programa que te calcula el tiempo que tarda en caer un objeto.");
        System.out.printf("Ingrese la altura = ");

        // scaner
        Scanner s = new Scanner(System.in);
        double altura = Double.parseDouble(s.nextLine());

        //calculos
        if (altura > -1) {
            altura = Math.sqrt(2 * altura / 9.81);
            System.out.printf("Tardaria en caer %.2f segundos\n", altura);
        } else {
            System.out.printf("La altura no puede ser numero negativo\n");
        }
        
    }
}
