import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Fran");
        nombres.add("Paula");
        nombres.add("Hector");
        nombres.add("Javi");
        nombres.add("alba");
        nombres.add("agustin");

        for (String na : nombres) {
            System.out.println(na+" ");
        }
    }
}
