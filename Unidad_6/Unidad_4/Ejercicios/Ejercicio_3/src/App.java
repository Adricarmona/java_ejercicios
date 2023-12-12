import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Pregunta
        System.out.println("Escribe un numero y te digo que dia de la semana coincide");
        System.out.printf("--> ");
        
        // Scaner
        Scanner s = new Scanner(System.in);
        int dia = Integer.parseInt(s.nextLine());

        // el resto
        switch (dia) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Error en la numeracion.");
                break;
        }
    }
}
