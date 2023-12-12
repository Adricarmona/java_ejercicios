public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 6");
        int num_a_adivinar = (int)(Math.random()*100);
        System.out.println("Que numero es("+num_a_adivinar+"):");
        int num = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("-> ");
            num = Integer.parseInt(System.console().readLine());
            if (num == num_a_adivinar) {
                System.out.println("Correcto");
                i += 5;
            } else if (num > num_a_adivinar || num < num_a_adivinar) {
                if (num > num_a_adivinar) {
                    System.out.println(num+" es mas grande que el numero a adivinar");
                } else if (num < num_a_adivinar) {
                    System.out.println(num+" es mas pequeño que el numero a adivinar");
                }
                System.out.println("Te quedan "+(5-i)+" intentos");
            }
        }
    }
}
