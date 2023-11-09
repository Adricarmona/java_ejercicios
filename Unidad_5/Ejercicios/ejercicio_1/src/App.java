public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Multiplos de 5 , de 0 al 100");
        System.out.println("----------------------------");
        for (int i = 1; i * 5 < 101; i++) {
            System.out.print(i * 5 +" ");
        }
    }
}
