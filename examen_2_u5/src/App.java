/*
 * @autor Adrian Carmona
 * @Curso 1ºDAM T
 * @Programa: Graphy
 *      Sirve para pintar numeros por pantalla
 */

import java.util.function.ToIntFunction;

public class App {
    public static void main(String[] args) throws Exception {
        long numero = 0;
        do {
            System.out.print("Introduzca un número: ");
            numero = Long.parseLong(System.console().readLine());
        } while (numero < 0); // en este bucle pide el numero y comprueba que el numero es mayor que 0
        
        // aqui pide si es simple o a color
        System.out.print("Simple o en Color (escriba S o C): ");
        String tipo = System.console().readLine().toUpperCase(); // pregunta si es S o C
        switch (tipo) {
            case "S":
                simple(numero); // nos metemos en el simple
                break;
            case "C":
                color(numero); // nos metemos en el de color
                break;
            default:
            System.out.println("Error en la ingresion de la letra");
                break;
        }
    }

/*
 * funcion que le da la vuelta al numero y te la entrega
 */
    public static long vuelta_al_numero(long numero) {
        long tmp = 0;
        for (long i = numero; i > 0; i/=10) {
            tmp += i % 10;
            tmp *= 10;
        }
        return tmp / 10;
    }

/*
 * Comprueba que numero es mas grande
 */
    public static int numero_mas_grande(long numero) {
        int num_grande = 0;
        for (long i = numero; i > 0; i/=10) {
            if (i % 10 > num_grande) {
                num_grande = (int)i % 10;
            }
        }
        return num_grande;
    }

/*
 *
 * El pintado de la version simple
 *
 */
    public static void simple(long numero) { // para imprimir el modo simple
        numero = vuelta_al_numero(numero);
        for (long i = numero; i > 0; i/=10) {
            // la barra de arriba de cada numero
            // le sumamos 1 para contar el 1º numero que no cuenta para los recuadros
            for (int j = 0; j < numero_mas_grande(numero) + 1; j++) { 
                System.out.print(" ---");
            }
            System.out.println(""); // salto de linea
            
            System.out.print("| "+i % 10+" |"); // imprimimos cada numero con su recuadro
            
            // la barra de arriba de cada numero
            // le sumamos 1 para contar el 1º numero que no cuenta para los recuadros
            for (int j = 0; j < numero_mas_grande(numero); j++) {  
                System.out.print(" ");
                if (j < i%10) {
                    System.out.print( "*");
                } else {
                    System.out.print( " ");
                }
                System.out.print(" |");
            }

            System.out.println(""); // salto de linea
        }
        
        // la barra de abajo del todo (se hace el ultimo ya que no se repite)
        for (int j = 0; j < numero_mas_grande(numero) + 1; j++) { 
                System.out.print(" ---");
            }
            System.out.println(""); // salto de linea para que no se vea el procentaje
    }

/*
 *
 * El pintado de la version a color
 * 
 */
    public static void color(long numero) {
        numero = vuelta_al_numero(numero);
        for (long i = numero; i > 0; i/=10) {
            // la barra de al lado de 
            // le sumamos 1 para contar el 1º numero que no cuenta para los recuadros
            if (i == numero) { // si es la primera linea se dibuja la esquina 
                System.out.print("╔");
            } else {
                System.out.print("╠");
            }
            
            /*
             * Comprobamos donde estamos y pintamos lo que toca
             */
            for (int j = 0; j < numero_mas_grande(numero) + 1; j++) {  
                System.out.print("═══");
                if (i == numero && j == numero_mas_grande(numero)) {
                    ;System.out.print("╗");
                } else if (j == numero_mas_grande(numero)) {
                    System.out.print("╣");
                } else if (i == numero ) {
                    System.out.print("╦");
                } else{
                    System.out.print("╬");
                }
            }
            System.out.println(""); // salto de linea
            
            System.out.print("║ "+i % 10+" ║"); // imprimimos cada numero con su recuadro
            
            /*
             * El contenido de las casillas, donde nos metemos en el switch y depende del numero total pintamos un color o otro
             * le sumamos 1 para contar el 1º numero que no cuenta para los recuadros
             */
            for (int j = 1; j < numero_mas_grande(numero) + 1; j++) {  
                if (j <= i%10) {
                    switch ((int)(i%10)) { // importante poner el i%10 entre parentesis para converitir en int el resultado y no el long entero
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.print("\033[41m   \033[0m");
                            break;
                        case 5:
                        case 6:
                            System.out.print("\033[42m   \033[0m");
                            break;
                        case 7:
                        case 8:
                            System.out.print("\033[44m   \033[0m");
                            break;
                        case 9:
                            System.out.print("\033[45m   \033[0m");
                            break;
                        default:
                        System.out.print((int)i%10);
                            break;
                    }
                } else {
                    System.out.print( "   ");
                }
                System.out.print("║");
            }

        System.out.println(""); // salto de linea
        }
        
        // la barra de abajo del todo (se hace el ultimo ya que no se repite)
        for (int j = 0; j < numero_mas_grande(numero) + 1; j++) { 
            if (j == 0) {
                System.out.print("╚");
            } else {
                System.out.print("╩");
            }
                System.out.print("═══");
        }
        System.out.println("╝"); // salto de linea con la esquina para que no se vea el procentaje
    }
}