import funciones.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] test = {4,6,8};
        test = filtraPrimos(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static int[] filtraPrimos(int x[]) {
        int[] primo = new int[x.length];
        int posPrimo = 0;
        primo[0] = -1;
        for (int i = 0; i < primo.length; i++) {
            if (generales.esPrimo(x[i])) {
                primo[posPrimo] = x[i];
                posPrimo++;
            }
        }

        return primo;
    }
}
