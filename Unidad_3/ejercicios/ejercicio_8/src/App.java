public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int horas;

        // pregunta las horas y hace los calculos
        System.out.printf("Bienvenido, coloca las horas trabajadas: ");
        horas = Integer.parseInt( System.console().readLine() );
        horas = horas * 12;
        System.out.printf("Ha ganado %d€\n", horas);
    }
}
