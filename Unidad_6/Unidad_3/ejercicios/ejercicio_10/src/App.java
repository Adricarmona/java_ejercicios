/*
 *  @autor: Adrian Carmona
 *  1º DAM programacion CPIFP Alan Turing
 */
public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double Mb;
        
        // Pregunta y calculos
        System.out.printf("Ingrese la cantidad de Mb que quiera convertir e Kb: ");
        Mb = Double.parseDouble(System.console().readLine() );
        Mb = Mb * 1024;
        System.out.printf("Esta cantidad de MB son %.2f Kb\n", Mb);
    }
}
