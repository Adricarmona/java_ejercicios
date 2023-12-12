import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // enunciado 1
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");

        // pregunta 1
        Scanner s = new Scanner(System.in);
        double a = Double.parseDouble(s.nextLine());

        // enunciado 2
        System.out.print("Ahora introduzca el valor de b: ");
        double b = Double.parseDouble(s.nextLine());

        // calculos y imrpirmir
        if ((b == 0)||(a == 0)) {
            System.out.printf("Esta ecuación no tiene solución real.");
        } else {
            a = b / a;            
            System.out.printf("x = %.2f\n", a);
        }    
    }
}
