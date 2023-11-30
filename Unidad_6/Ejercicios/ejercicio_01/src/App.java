public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 1");
        int num = 0;
        int total = 0;
        for (int i = 0; i < 3; i++) {
            num = (int)(Math.random()*6)+1;
            total += num;
            System.out.println(num);
        }
        System.out.println("total:"+total);
    }
}
