public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int base = 0;
        int exponente = 0;
        double total = 0;

        // titulos y preguntas 
        System.out.println("Programa que te calcula una potencia");
        System.out.println("------------------------------------");
        System.out.print("ingrese su base -> ");
        base = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese su exponente -> ");
        exponente = Integer.parseInt(System.console().readLine());

        // realizacion
        if ((base > 0) && (exponente > 0)) {
            total = base;
            System.err.print(base+" * ");
            for (int i = exponente - 1; i > 0; i--) {
                System.err.print(base);
                if (i > 1) 
                    System.out.print(" * ");
                total = total * base;
            }
            System.out.print(" = "+total);
        } else {
            System.out.println("No se aceptan 0");
        }
    }
}
