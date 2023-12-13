public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 23");
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = (int)(Math.random() * 6);
            caras(num);
        }
        System.out.println("");
    }

    public static void caras(int num) {
        switch (num) {
            case 0:
                System.out.print("As ");
                break;
            case 1:
                System.out.print("K ");
                break;
            case 2:
                System.out.print("Q ");
                break;
            case 3:
                System.out.print("J ");
                break;
            case 4:
                System.out.print("7 ");
                break;
            case 5:
                System.out.print("8 ");
                break;
            default:
                break;
        }
    }
}
