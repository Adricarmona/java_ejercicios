public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 10");
        int longitud;
        for (int i = 0; i < 10; i++) {
            longitud = (int)(Math.random()*40+1);
            for (int j = 0; j < longitud; j++) {
                caracteres((int)(Math.random()*6+1));
                if (j < longitud - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("");
        }
    }

    public static void caracteres(int num) {
        switch (num) {
            case 1:
                System.out.print("*");
                break;
            case 2:
                System.out.print("-");
                break;
            case 3:
                System.out.print("=");
                break;
            case 4:
                System.out.print(".");
                break;
            case 5:
                System.out.print("|");
                break;
            case 6:
                System.out.print("@");
                break;
            default:
        }
    }
}
