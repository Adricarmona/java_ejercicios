import matematicas.calculo;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 99999; i++) {
            if (calculo.esCapicua(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
