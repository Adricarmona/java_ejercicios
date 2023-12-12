/*
 *  @autor: Adrian Carmona
 *  1º DAM programacion CPIFP Alan Turing
 */
public class App {
    public static void main(String[] args) throws Exception {
        // variabes
        double nota1;
        double nota2;
                
        // pide los numeros
        System.out.printf("Introduce la nota del primer examen: ");
        nota1 = Double.parseDouble(System.console().readLine() );
        System.out.printf("¿Qué nota quieres sacar en el trimestre? ");
        nota2 = Double.parseDouble(System.console().readLine() );
        
        // calcula
        nota1 = (nota2 - (nota1 * 0.4)) / 0.6 ;

        // imprime el resultado
        System.out.printf("Para tener un %.2f en el trimestre necesitas un %.2f en el segundo examen.\n",nota2 ,nota1);
    }
}
