public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 12");
        int i = 1000;
        while (i > 0) {
            for (int j = 0; j < 100; j++) {
                pintado((int)(Math.random()*20));
            }
            System.out.println("");
            i--;
        }
    }

    public static void pintado(int num) {
        char caracter = (char)(Math.random()*94+32);
        switch (num) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.err.print(" ");
                break;
            case 19:
                System.err.print(caracter);
                break;
            default:
                break;
        }
    }
}
