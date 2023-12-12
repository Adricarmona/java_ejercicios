public class App {
    public static void main(String[] args) throws Exception {
        // las variables
        int nume = 0;

        // preguntas 
        System.out.println("Indica el numero que quieras saes su cuadrado y cubo.");
        System.out.print("-->");
        nume = Integer.parseInt(System.console().readLine());
        System.out.println("---------------------");

        // bucle
        for (int i = 1; i < 6 ; i++) {
            System.out.println(nume+" "+(nume*nume)+" "+(nume*nume*nume));
            nume++;
        }
    }
}
