import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // scanner
        Scanner s = new Scanner(System.in);
        
        // variable
        int hora;

        // programa
        System.out.println("Proporciona las horas");
        System.out.printf("--> ");
        hora = Integer.parseInt(s.nextLine());
        if (hora >= 24 || hora < 0){
            System.out.print("Error en los numeros");
        }else if (hora >= 6 && hora <= 12) {
            System.out.print("Buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.print("Buenas tardes");
        } else {
            System.out.print("Buenas noches");
        }
    }
}
