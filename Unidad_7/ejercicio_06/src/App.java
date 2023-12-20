public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 6");
        int[] num = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.print((i+1) + "- ");
            num[i] = Integer.parseInt(System.console().readLine());
        }

        /*
         * Lo que le da la vuelta al array
         */
        int tmp = num[14]; // guardamos el ultimo valor ya que lo perderiamos de otra manera
        for (int i = 14; i > 0 ; i--) { // contamos desde el final , y cogemos el numero de "delante"
            num[i] = num[ (i-1) ]; // para guardarlo en la posicion de "atras"
        }
        num[0] = tmp; // ponemos el primero el numero guardado anteriormente
        tmp = 0; // ponemos tmp en 0 
        
        for (int i = 0; i < 15; i++) {
            System.out.print(num[i]);
            if (i != 14) {System.out.print(" - ");}
        }
    }
}
