public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int base = 0;
        int exponente = 0;
        double total = 0;

        // titulos y preguntas 
        System.out.println("Programa que te calcula unas potencias");
        System.out.println("--------------------------------------");
        System.out.print("ingrese su base -> ");
        base = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese su exponente -> ");
        exponente = Integer.parseInt(System.console().readLine());
        System.out.println(" ");

        // realizacion
        if ((base > 0) && (exponente > 0)) {
            total = base;
            System.out.print(base+" ^1 = "+base+"\n");
            for (int i = 1; i < exponente; i++) {
                System.err.print(base+" ^"+(i+1));
                total = total * base;
                System.out.print(" = "+total+"\n");
            }

        } else {
            System.out.println("No se aceptan 0");
        }        
    }
}