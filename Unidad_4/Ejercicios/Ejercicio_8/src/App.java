import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // scaner
        Scanner s = new Scanner(System.in);
        
        // preguntas
        System.out.println("Ingrese las notas de los examenes que quiera calcular la media.(separados por un espacio)");
        System.out.print("-->");
        double nota_1 = s.nextDouble();
        double nota_2 = s.nextDouble();
        double nota_3 = s.nextDouble();

        // calculos
        nota_1 = (nota_1 + nota_2 + nota_3) / 3;

        // comrpobacion y imprimir
        if (nota_1 >= 0 && nota_1 <= 10) {
                    System.out.printf("La media de las notas es: %.2f sobre 10, ", nota_1);

        // nota del boletin
        if (nota_1 < 5) {
            System.out.print("ha sacado: insuficiente\n");
        } else if (nota_1 == 5) {
            System.out.print("ha sacado: suficiente\n");
        } else if (nota_1 == 6) {
            System.out.print("ha sacado: bien\n");
        } else if (nota_1 < 9 && nota_1 > 6) {
            System.out.print("ha sacado: notable\n");
        } else if (nota_1 > 8) {
            System.out.print("Felicidades ha sacado: sobresaliente\n");
        }
        } else {
            System.out.println("Error en la ingresion de nuemeros");
        }
    }
}
