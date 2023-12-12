public class App {
    public static void main(String[] args) throws Exception {
        // dato
        double baseimponible;
        double iva;
        double total;

        // meterle informacion
        baseimponible = 29;

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
