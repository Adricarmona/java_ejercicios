/*
 *  @autor: Adrian Carmona
 *  1º DAM programacion CPIFP Alan Turing
 */
public class App {
    public static void main(String[] args) throws Exception {
        // dato
        double baseimponible;
        double iva;
        double total;

        // meterle informacion
        System.out.printf("Ingrese el producto que quiera calcular : ");
        baseimponible = Double.parseDouble( System.console().readLine() );

        // calculos
        iva = baseimponible * 0.21;
        total = iva + baseimponible;

        // imprimir
        System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━┑");
        System.out.println("│ Factura de ######### │");
        System.out.println("┝━━━━━━━━━━━━━━━━━━━━━━┥");
        System.out.printf("│ %.2f€    (producto) │\n│ %.2f€        (iva)   │\n",baseimponible ,iva);
        System.out.println("┝━━━━━━━━━━━━━━━━━━━━━━┥");
        System.out.printf("│ %5.2f€      Total    │\n",total);
        System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━┙");
    }
}