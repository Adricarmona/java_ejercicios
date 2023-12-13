public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 22");

        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = Integer.parseInt(System.console().readLine());

        System.out.println("            @"); // 12 espacios y la cabeza (la arroba)
        int espacios = 12;
        int serpenteo = 0; // el numero del serpenteo que lo hace aleatorio
        for (int i = 0; i < longitud; i++) {
            serpenteo = (int)(Math.random()*3);
            switch (serpenteo) {
                case 0:
                    espacios -= 1;
                    break;
                case 1:
                    espacios += 1;
                default: // si toca 2 no hace nada
            }
            for (int j = 0; j < espacios; j++) { // pintamos los espacios
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
