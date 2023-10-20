public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double euros;
        double pesetas;
        double resultado;

        // datos
        euros = 0.0060; // valor de 1 peseta
        System.out.printf("Escriba el numero de pesetas qe quiera comprobar: ");
        pesetas = Integer.parseInt( System.console().readLine() ); 

        // conversor
        resultado = euros * pesetas;
        System.out.printf("--> %d pesetas son %.2f euros \n",(int)pesetas, resultado);
    }
}