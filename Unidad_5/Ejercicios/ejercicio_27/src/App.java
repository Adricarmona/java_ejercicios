public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0; // el numero indicado
        int cont = 0;  // cuenta los numeros que pasa
        int total = 0; // el numero total de la suma de los multiplos

        // titulo y leemos el numero
        System.out.println("Ejercicio_27");
        System.out.println("------------");
        System.out.println("Indica un numero");
        System.out.print("--> ");
        num = Integer.parseInt(System.console().readLine());

        // Calcula cuantos multiplos del 3 hay, los suma y los imprime
        System.out.print("- ");
        for (int i = 1; i < num + 1; i++) {
            if ((i % 3) == 0) {
                System.out.print(i+" ");
                total += i;
                cont++;
            }
        }

        // imprimimos los resultados
        System.out.println("\nEl total de multiplos de 3 que hay son:");
        System.out.println("- "+total);
        System.out.println("La cantidad de numeros que hay es:");
        System.out.println("- "+cont);
    }
}
