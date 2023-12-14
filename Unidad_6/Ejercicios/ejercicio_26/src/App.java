public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 26");

        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = Integer.parseInt(System.console().readLine());

        int mordisco_lado = (int)(Math.random() * 4); // 4 por que elige que lado va a tener el mordisco
        int mordisco_pos = 0;// la ponemos fuera por que sino no va
        if (mordisco_lado == 0 || mordisco_lado == 2) { // arriba y abajo
            mordisco_pos = (int)(Math.random() * anchura);
        } else { // si es izquierda o derecha
            mordisco_pos = (int)(Math.random() * altura); // la posicion donde muerde
        }

        // donde pintamos la tableta
        for (int i = 0; i < altura; i++) { // altura
            for (int j = 0; j < anchura; j++) { // altura
                //aqui especifica si es arriba o abajo
                if ((mordisco_lado == 0 && i == 0 || mordisco_lado == 2 && i == altura - 1) && j == mordisco_pos ) {
                    System.out.print(" ");
                // aqui es si es izquierda o derecha
                } else if ((mordisco_lado == 1 && j == 0 || mordisco_lado == 3 && j == anchura - 1) && i == mordisco_pos ) {
                    System.out.print(" ");
                } else { // aqui si no es un bocao
                    System.out.print("*");
                }
            }
            System.out.println(""); // salto de linea
        }
    }
}
