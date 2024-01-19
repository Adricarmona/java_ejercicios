import matematicas.calculo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 19");

        System.out.println("¿Que dato quieres transformar?");
        System.err.println(" ---------------------------------------------------- ");
        System.out.println("| 1º Binario | 2º Decimal | 3º Octal | 4º Hexadecimal|");
        System.err.println(" ---------------------------------------------------- ");
        System.out.print("-");
        int datosTransformar = Integer.parseInt(System.console().readLine());

        System.out.println("¿A que quiere transformarlo?");
        System.err.println(" ---------------------------------------------------- ");
        System.out.println("| 1º Binario | 2º Decimal | 3º Octal | 4º Hexadecimal|");
        System.err.println(" ---------------------------------------------------- ");
        System.out.print("-");
        int datosAHacer = Integer.parseInt(System.console().readLine());

        int dato = 0;
        switch (datosTransformar) {
            case 1: // binario
                switch (datosAHacer) {
                    case 1: // binario
                        System.out.println("Ya esta en binario");
                        break;
                    case 2: // decimal
                        dato = Integer.parseInt(System.console().readLine());
                        dato = calculo.binarioDecimal(dato);
                        break;
                    case 3: // octal
                        dato = calculo.binarioDecimal(dato);
                        break;
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
        System.out.println("El dato resultante es: "+dato);
    }
}
