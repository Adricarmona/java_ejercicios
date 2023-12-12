public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0;
        boolean primo = true;

        // titulo y pregunta el numero
        System.out.print("Comprobador si el numero es primo\n-> ");
        num = Integer.parseInt(System.console().readLine());

        // bucle donde lo comprueba
        for (int i = 2; i < num; i++) {
            if ((num%i) == 0)
                primo = false;
        }

        // damos el resultado final
        if (primo == true) {
            System.out.println("EL numero "+num+" es primo");
        } else {
            System.out.println("EL numero "+num+" no es primo");
        }
    }
}
