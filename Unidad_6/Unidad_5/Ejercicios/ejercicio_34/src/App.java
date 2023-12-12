public class App {
    public static void main(String[] args) throws Exception {
        // titulo y preguntando los numeros 
        System.out.println("ejercicio_34");
        System.out.print("Por favor, introduzca un número: ");
        int num2 = Integer.parseInt(System.console().readLine());// pedimos el primer numero
        System.out.print("Introduzca otro número: ");
        int num1 = Integer.parseInt(System.console().readLine());// pedimos el segundo numero
        // le ponemos el 2º primero para su buen funcionamiento

        int pares = 0; // generamos los pares
        int inpares = 0; // generamos los impares
        int tmp = 0; // generamos una variables que utilizaremos temporalmente

        // nos metemos en una variable que coge los numeros
        while (num1 != 0 || num2 != 0) {
            if (num1 != 0) { // comprobamos las letras del 1 libro
                tmp = num1 % 10;
                num1 = num1 / 10;
                if ((tmp % 2) == 0) { // si es par entra aqui sino en el otro
                    pares *= 10;
                    pares = pares + tmp;
                } else {
                    inpares *= 10;
                    inpares = inpares + tmp;
                }
                tmp = 0; // reiniciamos tmp para que no de errores
            }
            if (num2 != 0) { // comprobamos la letras del 2 numero
                tmp = num2 % 10;
                num2 = num2 / 10;
                if ((tmp % 2) == 0) { // si es par entra aqui sino en el otro
                    pares *= 10;
                    pares = pares + tmp;
                } else {
                    inpares *= 10;
                    inpares = inpares + tmp;
                }
                tmp = 0; // reiniciamos tmp para que no de errores
            }
        }
        pares = vuelta(pares);
        inpares = vuelta(inpares);
        System.out.println("El número formado por los dígitos pares es "+pares);
        System.out.println("El número formado por los dígitos impares es "+inpares);
    }

    public static int vuelta(int num) {
        int tmp = 0; // una variable temporal para darle la vuelta al numero
        for (int i = num; i > 0; i/=10) {
            tmp *= 10; // adelantamos el numero a la izquierda (si es 0 no hace nada)
            tmp = tmp + (i % 10); // metemos el dato qe queremos en la casilla
        }
        return tmp; // devolvemos el numero hecho
    }
}
