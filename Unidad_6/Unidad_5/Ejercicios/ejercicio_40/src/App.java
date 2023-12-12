public class App {
    public static void main(String[] args) throws Exception {
        int num = 0; // numero ingresado
        do {
        System.out.println("Ejercicio 40");
        System.out.print("Por favor, introduzca la altura del rombo:");
        num = Integer.parseInt(System.console().readLine());
        if (num < 3 || num % 2 == 0) {System.out.println("Error en la impresion del numero");}
        } while (num < 3 || num % 2 == 0);

        int espacios_f = num / 2 + 1; // espacios de fuera
        int espacios_d = 0; // espacios de dentro

        int altura = 1; // la altura
        // primera mitad
        while (altura <= num / 2 + 1 ) {
            for (int i = 1; i <= espacios_f; i++) {System.out.print(" ");} // pinta los primeros espacios
            System.out.print("*");// imprimimos el primer asterisco
            for (int i = 1; i < espacios_d; i++) {System.out.print(" ");} // pintamos los espacios del medio, empezamos en 1 por que es impar y asi cuando vamos añadiendo 2 sigue en impar
            if (altura > 1) {System.out.print("*");} // pintamos el ultimo asterisco
            System.out.println(""); // salto de linea

            espacios_d+=2; // añadimos dos espacios dentro
            espacios_f--; // vamos quitando un espacio de fuera
            altura++; // aumentamos la altura
        }

        // segunda mitad
        while (altura > 0 ) {
            for (int i = 1; i <= espacios_f; i++) {System.out.print(" ");} // pinta los primeros espacios
            System.out.print("*");// imprimimos el primer asterisco
            for (int i = 1; i < espacios_d; i++) {System.out.print(" ");} // pintamos los espacios del medio, empezamos en 1 por que es impar y asi cuando vamos añadiendo 2 sigue en impar
            if (altura > 1) {System.out.print("*");} // pintamos el ultimo asterisco
            System.out.println(""); // salto de linea

            espacios_d-=2; // añadimos dos espacios dentro
            espacios_f++; // vamos quitando un espacio de fuera
            altura--; // aumentamos la altura
        }
    }
}