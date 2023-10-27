import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // scaner
        Scanner s = new Scanner(System.in);
        
        // preguntas
        System.out.println("Ingrese las notas de los examenes que quiera calcular la media.");
        System.out.print("-->");
        double nota_1 = s.nextDouble();
        double nota_2 = s.nextDouble();
        double nota_3 = s.nextDouble();

        // calculos
        nota_1 = (nota_1 + nota_2 + nota_3) / 3;

        // imprimir
        System.out.printf("La media de las notas es: %.2f\n", nota_1);
    }
}
