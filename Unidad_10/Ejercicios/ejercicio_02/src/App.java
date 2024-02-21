import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int logitud = (int)(Math.random()*10+10);
        for (int i = 0; i < logitud; i++) {
            numeros.add((int)(Math.random()*101));
        }

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < logitud; i++) {
            if (numeros.get(i) > maximo) {
                maximo = numeros.get(i);
            }
            if (numeros.get(i) < minimo) {
                minimo = numeros.get(i);
            }
            total = total + numeros.get(i);
        }

        total = total / logitud;

        System.out.println("El maximo es "+maximo+"\n"+"El minimo es "+minimo+"\n"+"La media es "+total+"\nTamaño "+logitud);
    }
}
