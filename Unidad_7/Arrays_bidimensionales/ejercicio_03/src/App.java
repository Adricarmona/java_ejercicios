public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 4\n");
        
        /*
         * generamos los numeros aleatoriamente
         */
        int num[][] = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (int)(Math.random() * 900 + 100);
            }
        }

        /*
         * pintamos la tabla y sumamos el total de las filas
         */
        int tmp = 0;
        int total = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ",num[i][j]);
                tmp += num[i][j];
            }
            System.out.println("= "+tmp);
            total += tmp;
            tmp = 0;
        }

        /*
         * sumamos el total de las columnas y el total general
         */
        System.out.println("--------------------");
        tmp = 0;
        for (int i = 0; i < 5; i++) {
            tmp += (num[0][i] + num[1][i] + num[2][i] + num[3][i]);
            System.out.printf("%2d ",tmp);
            total += tmp; 
            tmp = 0; 
        }
        System.out.println("= "+total);
    }
}
