public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 55");
        System.out.print("Introduzca la altura (5 como mínimo): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int espacios = Integer.parseInt(System.console().readLine());
        if (altura < 5 || espacios < 1) { // comprovamos que los numeros ingresados son los correctos
            System.out.println("altura o espacios no validos.");
        } else {
            // parte de arriba
            // primera linea
            System.out.print("*");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.print("****");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println("****");

            // segunda linea y tercera linea
            for (int i = 0; i < 2; i++) {
                System.out.print("*");
                for (int j = 0; j < espacios; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < espacios + 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            // cuarta linea
            System.out.print("*");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.print("****");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println("****");

            // empieza la 2 mitad
            for (int i = 0; i < altura - 3; i++) {
                System.out.print("*");
                for (int j = 0; j < espacios + 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < espacios + 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            // ultima linea
            System.out.print("*");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.print("****");
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println("****");
        }
    }
}


/*

* **** ****
* *    *
* **** ****
*    *    *
* **** ****

*/