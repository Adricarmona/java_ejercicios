import funciones.generales;

public class App {
    public static void main(String[] args) throws Exception {
        String test = convierteEnMorse(1234);
        System.out.println(test);
    }

    public static String convierteEnMorse(int n) {
        n = generales.voltea(n);
        String morse = "";
        while (n > 0) {
            morse += traductorMorse(n%10);
            n /= 10;
        }

        return morse;
    }

    public static String traductorMorse (int n) {
        switch (n) {
            case 1:
                return ". _ _ _ _";
            case 2:
                return ". . _ _ _";
            case 3:
                return ". . . _ _";
            case 4:
                return ". . . . _";
            case 5:
                return ". . . . .";
            case 6:
                return "_ . . . .";
            case 7:
                return "_ _ . . .";
            case 8:
                return "_ _ _ . .";
            case 9:
                return "_ _ _ _ .";
            case 0:
                return "_ _ _ _ _";
            default:
                return "error";
        }
    }
}
