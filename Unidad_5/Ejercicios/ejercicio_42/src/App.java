public class App {
    public static void main(String[] args) throws Exception {
        int num = 0;
        System.out.println("################");
        System.out.println("#              #");
        System.out.println("# ejercicio_42 #");
        System.out.println("#              #");
        System.out.println("################\n");

        do {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = Integer.parseInt(System.console().readLine());
        } while (num < 0);

        for (int i = num; i < num + 5; i++) {
            System.out.print(i);
            if (primo(i)) {
                System.out.println(" es primo");
            } else {
                System.out.println(" no es primo");
            }
        }
    }
    public static boolean primo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if ((num%i) == 0)
                primo = false;
        }
        return primo;
    }
}
