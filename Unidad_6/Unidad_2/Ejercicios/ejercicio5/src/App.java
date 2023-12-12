public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double euros;
        double pesetas;
        double resultado;

        // datos
        euros = 0.0060; // valor de 1 peseta
        pesetas = 45; 

        // conversor
        resultado = euros * pesetas;
        System.out.printf("--> %d pesetas son %.2f euros \n",(int)pesetas, resultado);
    }
}
