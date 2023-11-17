public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0; // numero ingresado
        int total = 0; // numero total de la suma de los numeros ingresados
        int vueltas = 0; // la cantidad de iteraciones que da el bucle hasta que llega a 10000

        // titulo
        System.out.println("  ejercicio 23  ");
        System.out.println("----------------");
        System.out.println("ingrese numeros");
        
        do {
            System.out.print("- ");
            num = Integer.parseInt(System.console().readLine());

            total = total + num; // hacemos la suma del total
            vueltas++; // sumamos una iteracion cada vez que pasa

        } while (total < 10000);

        System.out.println("----------------");
        System.err.print("El total es "+total+" la cantidad de numeros utilizados es "+vueltas+" y la media es ");
        // calculamos la media y se la metemos en num
        num = total / vueltas;
        System.out.println(num);
    }
}
