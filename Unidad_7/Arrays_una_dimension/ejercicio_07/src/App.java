public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 7");
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = (int)(Math.random() * 21);
            System.out.print(num[i]+" ");
        }

        System.out.println(""); // salto de linea
        System.out.print("1º valor ->");
        int primervalor = Integer.parseInt(System.console().readLine());
        System.out.print("2º valor ->");
        int segundovalor = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < 100; i++) {
            if (num[i] == primervalor) {
                System.out.print(" <"+segundovalor+"> "); 
            } else {
                System.out.print(num[i]+" ");
            }
        }
    }
}
