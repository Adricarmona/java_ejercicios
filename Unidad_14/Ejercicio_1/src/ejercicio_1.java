/**
 * ejercicio_1
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Introduzca 6 numeros enteros");
        int numero = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < 6; i++) {
            tmp = pideNumero();
            if (numero < tmp)
                numero = tmp;
        }
        System.out.println("El numero mas grande es:"+numero);
    }

    public static int pideNumero(){
        int numero = 0;
        try {
            numero = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.print("//debe ser un numero entero//\n");
            pideNumero();
        }

        return numero;
    }
    
}