/*
 *  @autor: Adrian Carmona
 *  1º DAM programacion CPIFP Alan Turing
 */
public class App {
    public static void main(String[] args) throws Exception {
        // datos
        int longitud;
        int ancho;
        
        // preguntas
        System.out.printf("-------------------------------------------------- \n");
        System.out.printf(" Programa para calcular el area de un rectangulo \n");
        System.out.printf("-------------------------------------------------- \n");
        System.out.printf("Escriba la longitud: ");
        longitud = Integer.parseInt( System.console().readLine() );
        System.out.printf("Escriba el ancho: ");
        ancho = Integer.parseInt( System.console().readLine() );
        System.out.printf("-------------------------------------------------- \n");

        // calculos
        longitud = longitud * ancho;

        // dar los datos
        System.out.printf("el area del rectangulo es: %d\n", longitud);
    }
}
