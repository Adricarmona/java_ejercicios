/*
 *  @Autor: Adrian Carmona Galvez
 *  @Curso: 1º Dam CFIFP Alan Turing
 * 
 *  Programa que genera documentos del lenguaje Toki Pakala(Lengua estropeada)
 * 
 * #Funciones
 *  -main: Donde esta el titulo y entra en documento
 *  -documento: Genera el documento
 *  -parrafo: Genera los parrafos
 *  -frase: Genera las frases
 *  -palabras: Genera las palabras
 *  -silabas: Genera las silabas
 *  -vocales: Genera vocales
 *  -consonantes: Genera los consonantes
 */
public class Toki_Pakala  {
    public static void main(String[] args) throws Exception {
        System.out.println("Toki Pakala\n-----------\n");
        
        /*
         * funcion para escribir como documento
         */
        documento();
    }

    /*
     * en esta funcion genera la cantidad de parrafos de un documento (1 a 21) , indicando cada parrafo donde se
     * encuentra al principio del mismo y al final haciendo dos saltos de linea para que este todo alineado.
     */
    public static void documento() {
        int documento_long = (int)(Math.random() * 21 + 1);
        for (int i = 0; i < documento_long; i++) {
            System.out.println("---"+(i+1)+"º parrafo.");
            parrafo();
            System.out.println("\n");
        }
    }

    /*
     * Esta funcion imprime los parrafos, genera la cantidad de parrafos aleatorias entre 1 y 12 
     * y va imprimiento frases y salto de linea dobles al menos que sea la ultima
     */
    public static void parrafo() {
        int parrafos_long = (int)(Math.random() * 12 + 1);
        for (int i = 0; i < parrafos_long; i++) {
            frase();
            if (i != parrafos_long - 1) {
                System.out.println("\n");
            }
        }
    }

    /*
     * Imprimimos la frase con esta funcion, sacamos un numero aleatorio del 1 al 53 y segun ese numero
     * entramos en un bucle donde nos metemos en la funcion palabras y comprobamos si es la ultima palabra
     * para terminarla en "." o poner espacio
     */
    public static void frase() {
        int frase_long = (int)(Math.random() * 53 + 1);
        for (int i = 0; i < frase_long; i++) {
            palabras();
            if (i == frase_long - 1) {
                System.out.print(".");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void palabras() {
        /*
         *  sacamos un numero aleatorio entre 1 y 6 y le damos vueltas al bucle para imprimir las palabras
         */
        int palabra_long = (int)(Math.random() * 6 + 1);
        for (int i = 0; i < palabra_long; i++) {
            silabas();
        }
    }

    /*
     * en esta funcion imprimimos silabas
     */
    public static void silabas() {
        /*
         * sacamos un numero aleatorio del 0 al 7 (osea 8) y si toca 0 (vocal por que es 1/8) y si no 
         * consonate (por que consinante 7/8) y luego una vocal.
         */
        int consonante_vocal = (int)(Math.random() * 8);
        if (consonante_vocal == 0) {
            vocal();
        } else {
            consonate();
            vocal();
        }
    }

    /*
     * Esta funcion decide aleatoriamente que vocal imprime.
     */
    public static void vocal() {
        int vocal = (int)(Math.random() * 5);
        switch (vocal) {
            case 0:
                System.out.print("a");
                break;
            case 1:
                System.out.print("e");
                break;
            case 2:
                System.out.print("i");
                break;
            case 3:
                System.out.print("o");
                break;
            case 4:
                System.out.print("u");
                break;
            default:
        }
    }

        /*
     * Esta funcion decide aleatoriamente que consonante imprime.
     */
    public static void consonate() {
        int vocal = (int)(Math.random() * 9);
        switch (vocal) {
            case 0:
                System.out.print("p");
                break;
            case 1:
                System.out.print("t");
                break;
            case 2:
                System.out.print("k");
                break;
            case 3:
                System.out.print("s");
                break;
            case 4:
                System.out.print("m");
                break;
            case 5:
                System.out.print("n");
                break;
            case 6:
                System.out.print("l");
                break;
            case 7:
                System.out.print("j");
                break;
            case 8:
                System.out.print("w");
                break;
            default:
        }
    }
}
