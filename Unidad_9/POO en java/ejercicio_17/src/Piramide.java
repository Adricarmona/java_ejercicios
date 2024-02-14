public class Piramide {
    private static int PiramideCreados;

    private String piramide = "";

    Piramide(int n){
        int espacios = n - 1;
        int asteriscos = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < espacios; j++) {
                setPiramide(" ");
            }
            for (int j = 0; j < asteriscos; j++) {
                setPiramide("*");
            }
            espacios--;
            asteriscos +=2;
            setPiramide("\n");
        }
        setPiramideCreados();
    }

    public String getPiramide() {
        return piramide;
    }

    public void setPiramide(String piramide) {
        this.piramide += piramide;
    }

    @Override
    public String toString() {
        return  piramide;
    }

    public static int getPiramidesCreadas() {
        return PiramideCreados;
    }

    public static void setPiramideCreados() {
        PiramideCreados++;
    }
}
