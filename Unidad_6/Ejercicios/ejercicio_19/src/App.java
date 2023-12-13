public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 19");
        int num = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int med = 0; // la media
        for (int i = 0; i < 50; i++) {
            num = (int)(Math.random() * 300 - 100);
            System.out.print(num+" ");

            // si son pares y el num es mas grande que el maximo se mete aqui
            if (num % 2 == 0 && num > max) {
                max = num;
            }

            // si son inpares y el num es mas pequeño que el minimo se mete aqui
            if (num % 2 == 0 && num < min) {
                min = num;
            }

            med += num; // le sumamos la media a num
        }

        System.out.println(""); //salto de linea
        System.out.println("El minimo es "+min);
        System.out.println("El maximo es "+max);
        System.out.println("La media es "+med/50);
    }
}
