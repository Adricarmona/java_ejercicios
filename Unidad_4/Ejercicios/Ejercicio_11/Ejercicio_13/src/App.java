import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variables y Scaner
        int num_1;
        int num_2;
        int num_3;
        int tmp;
        Scanner s = new Scanner(System.in);

        // titulo
        System.out.println("Programa que ordene de mayor a menor los numeros metidos por pantalla");
        System.out.printf("numeros a ordendar(separados por un espacio) -->");
        num_1 = s.nextInt();
        num_2 = s.nextInt();
        num_3 = s.nextInt();

        // calculo
        if (num_1 < num_2){
            tmp = num_1;
            num_1 = num_2;
            num_2 = tmp;
        }

        if (num_2 < num_3){
            tmp = num_2;
            num_2 = num_3;
            num_3 = tmp;
        }
        
        if (num_1 < num_2){
            tmp = num_1;
            num_1 = num_2;
            num_2 = tmp;
        }

        // final
        System.out.printf("El orden de menor a mayor es: %d < %d < %d ", num_1, num_2, num_3);
    }
}
