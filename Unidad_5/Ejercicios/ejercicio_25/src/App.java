public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0;

        // titulo y preguntas
        System.out.println("Ejercicio 26");
        System.out.println("------------");
        System.out.print("ingrese un numero ->");
        num = Integer.parseInt(System.console().readLine());
        System.out.println("------------");

        // imprime el numero alreves
        while (num != 0) {
            System.out.print(num%10);
            num = num / 10;
        }
        System.out.println("");
    }
}
