import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double mas;
        double menos;
        
        // scaner
        Scanner s = new Scanner(System.in);

        // preguntando y inicializando las variables del scaner
        System.out.print("Programa que te hace una ecuacion de 2 grado.");
        System.out.print("Ingrese a, b y c de la siguiente formula (ax² + bx + c = 0) \n (separados por un espacio) --> ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        // comprobacion
        if ((a == 0.0d) && (b == 0.0d) && (c == 0.0d)) {
            System.out.println("Error en los datos ingresados");
        } else if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuacion tiene infinitas soluciones");
            } else if ((a == 0) && (b == 0) && (c != 0)) {
                System.out.println("La ecuaón no tiene solucion");
            } else {

            // calculando y inicializando el resto de variables
            double interior_raiz = (b * b) - 4 * a * c;
            if (interior_raiz < 0) {
                System.out.println("La ecuacion no tiene solucion real");
            } else {
                if ((a != 0) && (b != 0) && (c == 0)) {
                    mas = 0;
                    menos = -b / a;
                } else if ((a == 0) && (b != 0) && (c != 0)) {
                    mas = -c / b;
                    menos = mas;
                } else {
                    mas = (-b + Math.sqrt(interior_raiz)) / (2 * a);
                    menos = (-b - Math.sqrt(interior_raiz)) / (2 * a);
                }
                // imprimir
                System.out.printf("El resultado de la ecuacion es con la suma --> %.2f <-- es con la resta --> %.2f <--\n", mas , menos);                    
            }
        }
    }
}
