public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 49");
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        int num = 0; // el numero que vamos pidiendo
        int max = Integer.MIN_VALUE; // el maximo
        int medi = 0; // la media
        int min = Integer.MAX_VALUE; // el minimo
        int vueltas = 0; // las vueltas a la iteracion
        do {
            num = Integer.parseInt(System.console().readLine());
            if (primo(num) == false) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                medi += num;
                vueltas++;
            }
        } while (primo(num) == false);
        System.out.println("Máximo: "+max);
        System.out.println("Mínimo: "+min);
        System.out.println("Media: "+(double)medi/(double)vueltas);
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
