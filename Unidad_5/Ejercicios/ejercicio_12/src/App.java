public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int vueltas = 0;
        int tmp = 0;
        int tmp2 = 1;
        int impr = 0;

        // preguntas
        System.out.println("ingrese la cantidad de veces que quiera ver fibonacci");
        System.out.print("-->");
        vueltas = Integer.parseInt(System.console().readLine());

        // bucle
        for (int i = 1; i < vueltas; i++) {
            System.out.print(impr+", ");
            tmp = tmp2;
            tmp2 = impr;
            impr = tmp + tmp2;
        }

        if (vueltas > 0) {
            System.out.printf("%d\n", impr);
            tmp = tmp2;
            tmp2 = impr;
            impr = tmp + tmp2;
        }

    }
}
