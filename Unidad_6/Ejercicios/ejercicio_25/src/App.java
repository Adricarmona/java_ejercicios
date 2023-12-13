public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio_25");
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num = (int)(Math.random() * 190 + 1);
            if (primo(num) == true) {
                System.out.print("#"+num+"# ");
            } else {
                System.out.print(num+" ");
            }
        }
    }

    public static boolean primo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if ((num%i) == 0)
                primo = false;
        }
        return primo;
    }
}
