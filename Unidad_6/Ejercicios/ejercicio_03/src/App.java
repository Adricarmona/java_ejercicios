public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 3");
        int num_carta = (int)(Math.random()*10+1); // el numero de carta
        int for_carta = (int)(Math.random()*4+1); // el tipo de carta
        num_carta(num_carta);
        System.out.print(" de ");
        for_carta_carta(for_carta);

    }

    public static void for_carta_carta(int n) {
        switch (n) {
            case 1:
                System.out.print("Oros");
                break;
            case 2:
                System.out.print("Copas");
                break;
            case 3:
                System.out.print("Espadas");
                break;
            case 4:
                System.out.print("Bastos");
                break;
            default:
                System.out.print("-error-");
                break;
        }
    }

    public static void num_carta(int n) {
        switch (n) {
            case 1:
                System.out.print("As");
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
                System.out.print("Sota");
                break;
            case 9:
                System.out.print("Caballo");
                break;
            case 10:
                System.out.print("Rey");
                break;
            default:
                System.out.print("-error-");
                break;
        }
    }
}
