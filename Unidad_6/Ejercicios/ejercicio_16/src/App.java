public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 16");
        /*
         * las 3 figuras que se generan aleatoriamente
         * y con su funcion que imprime cuales son
         */
        int figura_1 = (int)(Math.random()* 5 + 1); 
        figuras(figura_1);
        int figura_2 = (int)(Math.random()* 5 + 1); 
        figuras(figura_2);
        int figura_3 = (int)(Math.random()* 5 + 1);
        figuras(figura_3);
        System.out.println(""); // salto de linea 
        if (figura_1 == figura_2 && figura_1 == figura_3) { // comprueba que sean iguales los 3
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura_1 == figura_2 || figura_2 == figura_3 || figura_1 == figura_3) { // comprueba que 2 sean iguales
            System.out.println("Bien, ha recuperado su moneda");
        } else { // ninguno son iguales
            System.out.println("Lo siento, ha perdido");
        }
    }

    public static void figuras(int num) { // funcion que imprime las figuras
        switch (num) {
            case 1:
                System.out.print("corazón ");
                break;
            case 2:
                System.out.print("diamante ");
                break;
            case 3:
                System.out.print("herradura ");
                break;
            case 4:
                System.out.print("campana ");
                break;
            case 5:
                System.out.print("limón ");
                break;
            default:
        }
    }
}
