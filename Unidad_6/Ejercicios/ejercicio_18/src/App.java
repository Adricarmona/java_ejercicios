public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 18");
        // colores
        int color1 = 0;
        int color2 = 0;
        int color3 = 0;

        for (int i = 1; i <= 3; i++) { //bucle para las habitaciones
            color1 = (int)(Math.random() * 6 + 1); // primer color

            // segundo color y comrpobamos que no sea igual al primero
            do {
                color2 = (int)(Math.random() * 6 + 1); 
            } while (color2 == color1);

            // tercer color y comrpobamos que no sea igual al primero ni al segundo
            do {
                color3 = (int)(Math.random() * 6 + 1); 
            } while (color3 == color1 || color3 == color2);
            
            // decimos el numero de habiatacion que es y pintamos los colores que son
            System.out.println(i+"º habitacion");
            colores(color1);
            colores(color2);
            colores(color3);
            System.out.println(""); // salto de linea
        }
    }

    public static void colores(int colores) {
        switch (colores) {
            case 1:
                System.out.print("rojo ");
                break;
            case 2:
                System.out.print("azul ");
                break;
            case 3:
                System.out.print("verde ");
                break;
            case 4:
                System.out.print("amarillo ");
                break;
            case 5:
                System.out.print("violeta ");
                break;
            case 6:
                System.out.print("naranja ");
                break;
            default:
        }
    }
}
