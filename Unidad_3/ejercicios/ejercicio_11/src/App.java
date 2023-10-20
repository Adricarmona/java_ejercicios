/*
 *  @autor: Adrian Carmona
 *  1º DAM programacion CPIFP Alan Turing
 */
public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double Kb;
        
        // Pregunta y calculos
        System.out.printf("Ingrese la cantidad de Kb que quiera convertir e Mb: ");
        Kb = Double.parseDouble(System.console().readLine() );
        Kb = Kb / 1024;
        System.out.printf("Esta cantidad de KB son %.2f Mb\n", Kb);
    }
}