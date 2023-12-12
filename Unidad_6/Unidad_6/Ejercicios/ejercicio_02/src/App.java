public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 2");
        int num_carta = (int)(Math.random()*13+1); // el numero de carta
        int for_carta = (int)(Math.random()*4+1); // el tipo de carta
        num_carta(num_carta);
        System.out.print(" ");
        for_carta_carta(for_carta);

    }

    public static void for_carta_carta(int n) {
        switch (n) {
            case 1:
                System.out.print("Picas");
                break;
            case 2:
                System.out.print("Coraczones");
                break;
            case 3:
                System.out.print("Diamantes");
                break;
            case 4:
                System.out.print("Tréboles");
                break;
            default:
                System.out.print("-error-");
                break;
        }
    }

    public static void num_carta(int n) {
        switch (n) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.print("Q");
                break;
            case 13:
                System.out.print("K");
                break;
            default:
                System.out.print("-error-");
                break;
        }
    }
}
