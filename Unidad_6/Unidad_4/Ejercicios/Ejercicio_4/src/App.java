public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int horas;

        // pregunta las horas y hace los calculos
        System.out.printf("Bienvenido, coloca las horas trabajadas: ");
        horas = Integer.parseInt( System.console().readLine() );
        if (horas < 41) {
            horas = horas * 12;
        System.out.printf("Ha ganado %d€\n", horas);
        } else {
            horas = horas * 16;
        System.out.printf("Ha ganado %d€\n", horas);
        }
        
    }
}