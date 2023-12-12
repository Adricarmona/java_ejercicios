public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int positivos = 0;
        int negativos = 0;
        int ingresado = 0;

        // pregunta y ingreso
        System.out.println("Ingrese numeros para contarlos si son negativos o positivos");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.err.print("- ");
            ingresado = Integer.parseInt(System.console().readLine());
            if (ingresado > 0) {
                positivos++;
            } else if (ingresado < 0) {
                negativos++;
            }
        }
        System.out.print("Son "+positivos+" positivos y "+negativos+" negativos");
    }
}
