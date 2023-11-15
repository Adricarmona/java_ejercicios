public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Multiplos de 5 , de 0 al 100, pero con do-while");
        System.out.println("-----------------------------------------------");
        int i = 1;
        do {
            System.out.print(i * 5 +" ");
            i++;
        } while (i * 5 < 101);
    }
}
