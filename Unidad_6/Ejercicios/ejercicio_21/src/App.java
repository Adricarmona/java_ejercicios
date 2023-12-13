public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 21");
        int cara_o_cruz = 0;
        int dinero = 0;

        for (int i = 0; i < 5; i++) { //para contar las 5 monedas
            dinero((int)(Math.random()* 8 + 1));
            cara_o_cruz((int)(Math.random() * 2 + 1));
            System.out.println(""); // salto de linea
        }

    }

    public static void cara_o_cruz(int num) {
        switch (num) {
            case 1:
                System.out.print("cara");
                break;
            case 2:
                System.out.print("cruz");
                break;
            default:
        }
    }

    public static void dinero(int dinero) {
        switch (dinero) {
            case 1:
                System.out.print("1 céntimo - ");
                break;
            case 2:
                System.out.print("2 céntimo - ");
                break;
            case 3:
                System.out.print("5 céntimo - ");
                break;
            case 4:
                System.out.print("10 céntimo - ");
                break;
            case 5:
                System.out.print("20 céntimo - ");
                break;
            case 6:
                System.out.print("50 céntimo - ");
                break;
            case 7:
                System.out.print("1 euro - ");
                break;
            case 8:
                System.out.print("2 euro - ");
                break;
            default:
        }
    }
}
