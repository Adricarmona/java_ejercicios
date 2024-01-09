public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 14");

        /*
         * declaramos los colores y pedimos las palabras
         */
        String colores[] = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String array_original[] = new String[7];
        for (int i = 0; i < array_original.length; i++) {
            System.out.print(i+1+"-> ");
            array_original[i] = System.console().readLine().toLowerCase();
        }

        /*
         * declaramos dos variables una temporal para ir metiendo los colores primero 
         */
        String array_temporal[] = new String[7];
        int vueltas_al_tmp = 0;
        for (int i = 0; i < array_original.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if (array_original[i].equals(colores[j])) {
                array_temporal[vueltas_al_tmp] = array_original[i];
                vueltas_al_tmp++;
                }
            }
        }

        /*
         * metemos el resto en los siguientes, comprobando con una buleano si tiene color o no y
         * metiendo en un if que si no tiene color da una vuelta
         */
        boolean color;
        for (int i = 0; i < array_temporal.length; i++) {
            color = false;
            for (int j = 0; j < colores.length; j++) {
                if (array_original[i].equals(colores[j])) {
                color = true;
                }
            }
            if (color == false) {
                array_temporal[vueltas_al_tmp] = array_original[i];
                vueltas_al_tmp++;
            }
        }

        /*
         * imprimimos los numeros
         */
        for (int i = 0; i < array_temporal.length; i++) {
            System.out.printf(" ----------");
        }
        System.out.print("\n|");
        for (int i = 0; i < array_temporal.length; i++) {
            System.out.printf("%10s|",array_temporal[i]);
        }
        System.out.println("");
        for (int i = 0; i < array_temporal.length; i++) {
            System.out.printf(" ----------");
        }
        System.out.println("");
    }
}
