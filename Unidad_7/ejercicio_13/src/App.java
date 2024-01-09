public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 13");

        /*
         * Genera los numeros y comprueba si son el maximo o el minimo mientras los va imprimiendo
         */
        int[] numeros = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int)(Math.random() * 501);
            System.out.print(numeros[i]+" ");
            if (numeros[i] > max) {
                max = numeros[i];
            } else if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        /*
         * pregunta si minimo o maximo y si esta mal metido el dato sale del programa
         */
        System.out.print("\n\n¿Qué quiere destacar?(1 - mínimo, 2 - máximo): ");
        int max_o_min = Integer.parseInt(System.console().readLine());
        if (!(max_o_min == 1 || max_o_min == 2)) {
            System.out.println("Error en la ingresion del dato");
            return;
        }
        System.out.println(""); // salto de linea para que sea estetico

        /*
         * Imprime los numeros y si lon los indicados con asteriscos
         */
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == max && max_o_min == 2) {
                System.out.print("**"+numeros[i]+"** ");
            } else if (numeros[i] == min && max_o_min == 1) {
                System.out.print("**"+numeros[i]+"** ");
            } else {
                System.out.print(numeros[i]+" ");
            }
        }
    }
}
