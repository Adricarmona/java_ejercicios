/*
 *  @autor: Adrian Carmona
 *  1º DAM programacion CPIFP Alan Turing
 */
public class App {
    public static void main(String[] args) throws Exception {
        // datos
        int base;
        int altura;
        
        // preguntas
        System.out.printf("------------------------------------------------- \n");
        System.out.printf(" Programa para calcular el area del un triangulo \n");
        System.out.printf("------------------------------------------------- \n");
        System.out.printf("Escriba la base: ");
        base = Integer.parseInt( System.console().readLine() );
        System.out.printf("Escriba el altura: ");
        altura = Integer.parseInt( System.console().readLine() );
        System.out.printf("------------------------------------------------- \n");

        // calculos
        base = (base * altura) / 2;

        // dar los datos
        System.out.printf("el area del triangulo es: %d\n", base);
    }
}
