public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 31");

        System.out.print("Introduce el dinero que quiera apostar: ");
        int dinero = Integer.parseInt(System.console().readLine());

        int dados1 = (int)(Math.random()* 6 + 1);
        int dados2 = (int)(Math.random()* 6 + 1);
        int dadosaux1 = 0;
        int dadosaux2 = 0;
        System.out.printf("| "+dados1+" + "+dados2+" = %2d|\n", (dados1+dados2));

        if (7 == dados1 + dados2 || 11 == dados1 + dados2) {
            dinero = dinero + dinero;
            System.out.println("Has ganado");
        } else if (2 == dados1 + dados2 || 3 == dados1 + dados2 || 12 == dados1 + dados2) {
            dinero = 0;
            System.out.println("Has perdido");
        } else {
            System.out.println("Segunda oportunidad");
            do {
                dadosaux1 = (int)(Math.random()* 6 + 1);
                dadosaux2 = (int)(Math.random()* 6 + 1);
                System.out.printf("| "+dadosaux1+" + "+dadosaux2+" = %2d|\n", (dadosaux1+dadosaux2));
                if ((dados1 + dados2) == (dadosaux1 + dadosaux2)) {
                    dinero = dinero + dinero;
                    System.out.println("Has ganado");
                } else if (7 == (dadosaux1 + dadosaux2)) {
                    System.out.println("Has perdido");
                    dinero = 0;
                }
            } while ((dados1 + dados2) != (dadosaux1 + dadosaux2) && 7 != (dadosaux1 + dadosaux2) );
        }
        System.out.println("Su dinero es: "+dinero);
    }
}
