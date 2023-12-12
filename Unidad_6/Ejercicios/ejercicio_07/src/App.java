public class App {
    public static void main(String[] args) {
        int res;
        int col = 3;
        for (int fila = 1; fila <= 15; fila++) {
            System.out.print(fila+". ");
            if (fila == 15) {
                col = 1;
            }
            for (int i = 1; i <= col; i++) {
                res = (int)(Math.random() * 3) + 1;
                switch(res) {
                case 1:
                    System.out.print(" 1 |");
                    break;
                case 2:
                    System.out.print(" 2 |");
                    break;
                case 3:
                    System.out.print(" X |");
                    default:
                }
            }
        System.out.println();
        }
    }
}