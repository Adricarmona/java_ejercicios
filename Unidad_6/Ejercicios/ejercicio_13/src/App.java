public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 13");
        int dado_1 = 0;
        int dado_2 = 0;
        do {
            dado_1 =(int)(Math.random()*6+1);
            dado_2 =(int)(Math.random()*6+1);
            System.out.println("#-----------#");
            System.out.println("| Dado 1: "+dado_1+" |");
            System.out.println("| Dado 2: "+dado_2+" |");
            System.out.println("#-----------#");
        } while (dado_1 != dado_2);
    }
}
