public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0;
        int total = 0;

        // pregunta el numero y el titulo
        System.out.println("Ingrese el numero que quiera que sume los 100 siguientes");
        System.out.println("--------------------------------------------------------");
        do {
            System.out.print("-");
            num = Integer.parseInt(System.console().readLine());
            if (num < 0)
                System.out.println("Tiene que ser un numero positivo\n");
        } while (num < 0);

        // procedo a hacer los calculos
        for (int i = num; i < num + 100; i++) {
            System.err.print(i);
            if (i < num + 99)
                System.out.print(" + ");
            total = total + i;
        }
        System.out.print(" = "+total);
        System.out.println("\nEl numero total de "+num+" es: "+total);
    }
}
