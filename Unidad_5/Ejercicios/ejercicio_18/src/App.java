public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num_1 = 0;
        int num_2 = 0;
        int tmp = 0;

        // donde se ingresan los numeros
        System.out.println("Ingrese dos numeros");
        do {
            System.out.print("1º-");
            num_1 = Integer.parseInt(System.console().readLine());
            System.out.print("2º-");
            num_2 = Integer.parseInt(System.console().readLine());
            // detecta que son diferentes
            if (num_1 == num_2) {
                System.out.println("Los numeros ingresados son iguales");
            }
        } while (num_1 == num_2);

        // Comprueba cual es el minimo y lo pone en num_1
        if (num_1 > num_2) {
            tmp = num_1;
            num_1 = num_2;
            num_2 = tmp;
        }

        // revisa si son menos de 7 y ejecuta el codigo dentro
        if (num_2 - num_1 > 7) {
            // da la iteraciones necesarias mientras escribe los numeros 
            for (int i = num_1; i < num_2; i = i + 7) {
                System.out.print(i+" ");
            }
        } else {
            System.out.println("La diferencia entre los numeros es menor a 7");
        }
        System.out.println(" ");
    }
}
