public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 55");
        System.out.print("Introduzca la altura (5 como mínimo): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int espacios = Integer.parseInt(System.console().readLine());
        if (altura < 5 || espacios < 1) { // comprovamos que los numeros ingresados son los correctos
            System.out.println("altura o espacios no validos.");
        } else {
            
        }
    }
}
