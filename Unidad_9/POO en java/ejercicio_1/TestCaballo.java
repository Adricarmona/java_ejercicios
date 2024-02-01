package ejercicio_1;

public class TestCaballo {
    public static void main(String[] args) {
        Caballo carlos = new Caballo("Carlos");
        carlos.patalea();
        carlos.color = "negro";
        System.out.println(carlos.color);
    }
}
