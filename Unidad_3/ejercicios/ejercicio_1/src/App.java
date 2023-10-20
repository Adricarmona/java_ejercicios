// multiplicadora
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double num1;
        double num2;

        Scanner s = new Scanner(System.in);

        // ejecucion
        System.out.printf("Escriba los numeros que quiera multiplicar: ");
        num1 = s.nextDouble();
        System.out.printf(" * ");
        num2 = s.nextDouble();
        num1 = num1 * num2;
        System.out.printf("= %.2f \n",num1);
    }
}
