public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num1 = 0; // primer numero preguntado, el numero que cuenta para abajo 
        int num2 = 0; // segundo numero preguntado, el que pregunta los divisores que no se van a mostrar

        // titulo y preguntas del mismo numero
        System.out.println(" ejercicio 29");
        System.out.println("--------------");
        System.out.print("indica el 1º numero-> ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.print("indica el 2º numero-> ");
        num2 = Integer.parseInt(System.console().readLine());

        // comprobamos los numeros mientras imprimimos
        for (int i = 0; i < num1; i++) {
            if ((i % num2) != 0) {
                System.out.print(i+"");
            }
        }
    }
}
