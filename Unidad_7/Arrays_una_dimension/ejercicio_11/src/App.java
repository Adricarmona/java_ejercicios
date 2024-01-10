public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 11");
        
        /*
         * pedimos los numeros y los metemos en una variable temporal
         */
        System.out.println("Ingrese 10 numeros");
        int[] numero = new int[10]; 
        int[] tmp = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"º ->");
            numero[i] = Integer.parseInt(System.console().readLine());
        }
        tmp = numero;

        /*
         * comprobamos que el numero es primo y luego si no es primo, metiendolo en el numero en si
         */
        int pos_final = 0;
        for (int i = 0; i < 10; i++) {
            if (primo(tmp[i])) {
                numero[pos_final] = tmp[i];
                pos_final++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!primo(tmp[i])) {
                numero[pos_final] = tmp[i];
                pos_final++;
            }
        }

        /*
         * imprimimos el restulado final
         */
        for (int i = 0; i < 10; i++) {
            System.out.print(numero[i]+" ");
        }
    }

    /*
     * numeros primos
     */
    public static boolean primo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if ((num%i) == 0)
                primo = false;
        }
        return primo;
    }

}
