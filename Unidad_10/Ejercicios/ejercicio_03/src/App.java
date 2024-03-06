import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca numeros");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+"->");
            numeros.add(Integer.parseInt(System.console().readLine()));
        }

        for (Integer integer : numeros) {
            System.out.print(integer+" ");
        }
    }
}
