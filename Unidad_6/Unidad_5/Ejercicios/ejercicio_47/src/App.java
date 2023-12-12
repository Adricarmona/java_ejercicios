public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 47");
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = Integer.parseInt(System.console().readLine());
        
        if (altura >= 5 && altura % 2 != 0) {

            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= 6; j++) {
                    if (i == 1 || j == 1 || i == altura || j == 6 || i == 1 + altura / 2) {
                        System.out.print("M");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

        } else {
            System.out.println("La altura introducida no es correcta");
        }
    }
}