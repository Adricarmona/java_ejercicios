public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0; // el numero ingresado
        int totales = 0; // la cantidad de numeros ingresados
        int impares = 0; // vueltas y impares son para la misma iteracion
        int vueltas = 0; // para hacer la media
        int par = 0; // el numero par mas grande par ingresado
        
        // titulo y pregunta
        System.out.println("ejercicio 21");
        System.out.println("------------");
        System.out.println("Introduce los numeros");
        
        // bucle donde comprobamos los numeros
        do {
            System.out.print("-");
            num = Integer.parseInt(System.console().readLine()); // escribiendo los numeros
            if (totales >= 0) {totales++;} // cuenta los numeros totales
            if ((num % 2) != 0) {
                impares = impares + num; // contamos el total de numeros impares y el de vueltas
                vueltas++;
            }
            if ((num % 2) == 0) { // comprobamos que sea par
                if (num > par) {par = num;} // comprobamos que el numero sea mas grande y lo cambiamos
            }
        } while (num > 0);
        // salimos del bucle y damos el resultado final
        System.out.print("La cantidad de numeros totales son "+totales);
        if (impares > 0) { // Imprimimos la media de los numeros impares
            System.out.print(" ,la media de los numeros impares es "+(impares/vueltas));
        }
        if (par > 0) { // Imprimimos el numero par mas alto 
            System.err.print(" ,el numero mas grande par es "+par);
        }
        System.out.println("."); // imprimimos un punto y final y un salto de linea para que quede bonito
    }
}
