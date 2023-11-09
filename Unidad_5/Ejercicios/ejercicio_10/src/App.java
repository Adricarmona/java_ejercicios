public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int nume = 0;
        int total = 0;

        // preguntas
        System.out.println("Ingrese numeros positivos que quiera sumar, y uno negativo para parar");
        System.out.println("---------------------------------------------------------------------");

        // bucle y primera pregunta
        System.out.print("-");
        nume = Integer.parseInt(System.console().readLine());
        while (nume > 0) {
            total = total + nume;
            System.out.print("-");
            nume = Integer.parseInt(System.console().readLine());
        }

        // final
        System.out.println("El numero sumado total es "+total);
    }
}
