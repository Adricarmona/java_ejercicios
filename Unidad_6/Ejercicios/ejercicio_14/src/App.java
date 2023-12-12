public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 14");
        int num_min = 0;
        int num_max = 0;
        System.out.print("Que numero quiere adivinar: ");
        int num = Integer.parseInt(System.console().readLine());
        int num_a_adivinar = (int)(Math.random() * 100 + 1);
        for (int i = 1; i <= 5; i++) {
            if (num == num_a_adivinar) {
                System.out.println("Correcto");
                i += 5;
            } else if (num > num_a_adivinar || num < num_a_adivinar) {
                if (num < num_a_adivinar) { // el numero ingresado es mas grande que el generado por pc
                    System.out.println("-> "+num_a_adivinar+" es mas grande que el numero a adivinar");
                    num_min = num_a_adivinar;
                } else if (num > num_a_adivinar) { // el numero ingresado es menor al generado por pc
                    System.out.println("-> "+num_a_adivinar+" es mas pequeño que el numero a adivinar");
                    num_max = num_a_adivinar;
                }
                System.out.println("Te quedan "+(5-i)+" intentos");
            }
            num_a_adivinar = (int)(Math.random() * (num_max - num_min)+ num_min + 1);
        }
    }
}