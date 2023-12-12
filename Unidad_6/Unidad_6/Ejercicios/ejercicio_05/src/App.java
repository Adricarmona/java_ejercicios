public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 5");
        int num;
        int media = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 50; i++) {
            num = (int)(Math.random()*100+100);
            if (num < min) {
                min = num;
            } else if ( num > max ) {
                max = num;
            }
            media += num;
            System.out.print(num+" ");
        }
        System.out.println("");
        System.out.println("El minimo es "+min+" el maximo es "+max+" la media es "+media/50+".");
    }
}
