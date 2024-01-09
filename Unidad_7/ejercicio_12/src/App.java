public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 12");

        /*
         * pedimos los numeros y hacemos un temporal
         */
        System.out.println("Ingrese 10 numeros");
        int[] numero = new int[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print(i+"º ->");
            numero[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.print("inicial: ");
        int inicial = Integer.parseInt(System.console().readLine());
        System.out.print("final: ");
        int fina = Integer.parseInt(System.console().readLine());
        int[] tmp = new int[10];

        /*
         * modificamos las posiciones de numero inicial en final y movemos los numeros acorde
         */
        if (inicial < fina) {
            for (int i = 0; i < 10; i++) { // copiamos todos los numeors en tmp
                tmp[i] = numero[i];
            }

            tmp[fina] = numero[inicial]; // el numero primero lo pone en el final del tmp

            for (int j = fina + 1; j < 10; j++) { // 
                tmp[j] = numero[j - 1];
            }

            tmp[0] = numero[9]; // cambiamos el ultimo numero normal a la primera posicion de tmp

            for (int j2 = 0; j2 < inicial; j2++) { // vuelve a poner todos los numerso hasta inicial
                tmp[j2 + 1] = numero[j2];
            }
        } else {
            System.out.println("Error en la ingresion de inicial y final");
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(tmp[i]+" ");
        }
    }
}
