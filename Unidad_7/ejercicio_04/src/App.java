public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 4");
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero [i] * cuadrado[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(numero[i]);
            if (i < 19) {System.out.print(" - ");}
        }
        System.out.println("#");
        for (int i = 0; i < 20; i++) {
            System.out.print(cuadrado[i]);
            if (i < 19) {System.out.print(" - ");}
        }
        System.out.println("#");
        for (int i = 0; i < 20; i++) {
            System.out.print(cubo[i]);
            if (i < 19) {System.out.print(" - ");}
        }
    }
}
