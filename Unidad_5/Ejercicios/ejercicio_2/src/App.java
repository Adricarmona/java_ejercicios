public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Multiplos de 5 , de 0 al 100, pero con while");
        System.out.println("--------------------------------------------");
        int i = 1;
        while (i * 5 < 101) {
            System.out.print(i * 5 +" ");
            i++;
        }
    }
}
