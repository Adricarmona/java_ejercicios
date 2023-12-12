/*
 *  @autor: Adrian Carmona
 *  1º DAM programacion CPIFP Alan Turing
 */
public class App {
    public static void main(String[] args) throws Exception {
        // datos
        double radio;
        double altura;
        
        // preguntas
        System.out.printf("------------------------------------------------- \n");
        System.out.printf("    Programa para calcular el area de un cono \n");
        System.out.printf("------------------------------------------------- \n");
        System.out.printf("Escriba la radio: ");
        radio = Double.parseDouble( System.console().readLine() );
        System.out.printf("Escriba el altura: ");
        altura = Double.parseDouble( System.console().readLine() );
        System.out.printf("------------------------------------------------- \n");

        // calculos
        radio = (3.1416 * ( radio * radio) * altura ) / 3;

        // dar los datos
        System.out.printf("el area del cono es: %.2f\n", radio);
    }
}