public class App {
    public static void main(String[] args) throws Exception {
        // variables
        double euros;
        double pesetas;
        double resultado;

        // datos
        euros = 45.2;
        pesetas =166.3860; // valor de 1 euro

        // conversor
        resultado = euros * pesetas;
        System.out.printf("--> %.2f euros son %d pesetas \n",euros, (int)resultado);
    }
}
