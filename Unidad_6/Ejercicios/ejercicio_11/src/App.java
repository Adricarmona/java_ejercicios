public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 11");
        int notas;
        /*
         * el total de las notas sumadas en el switch
         */
        int total_suspensos = 0;
        int total_suficiente = 0;
        int total_bien = 0;
        int total_notable = 0;
        int total_sobresaliente = 0;
        for (int i = 0; i < 20; i++) {
            notas = (int)(Math.random()*5);
            switch (notas) { // depende de el numero es una nota o otra
                case 0:
                    total_suspensos++;
                    System.out.print("Suspenso");
                    break;
                case 1:
                    total_suficiente++;
                    System.out.print("Suficiente");
                    break;
                case 2:
                    total_bien++;
                    System.out.print("Bien");
                    break;
                case 3:
                    total_notable++;
                    System.out.print("Notable");
                    break;
                case 4:
                    total_sobresaliente++;
                    System.out.print("Sobresaliente");
                    break;
                default:
            }
            if (i < 19) { // si no es la ultima nota pone tilde
                System.out.print(", ");
            }
        }
        System.out.println(""); // salto de linea y todos los totales
        System.out.println("Total de suspensos: "+total_suspensos+" de suficientes: "+total_suficiente+" de bienes "+total_bien+" de notables "+total_notable+" de sobresalientes "+total_sobresaliente);
    }
}
