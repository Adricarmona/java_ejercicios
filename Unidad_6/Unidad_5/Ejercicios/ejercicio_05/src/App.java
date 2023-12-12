public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Numeros del 320 al 160 de 20 en 20 para atras con while");
        System.out.println("-------------------------------------------------------");
        int i = 320;
        while (i > 159) {
            System.out.print(i+" ");
            i = i - 20;
        }
    }
}
