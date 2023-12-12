public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int codigo = 0000;
        boolean acertado = false;
        
        System.out.println("Caja fuerte, ingrese la contraseña de la caja fuerte (4 cifras)");
        for (int i = 1; i < 5; i++) {
            System.out.print("-->");
            codigo = Integer.parseInt(System.console().readLine());
            if (Integer.hashCode(codigo) == Integer.hashCode(4682)) {
                
                acertado = true;
                i = 5;
                System.out.println("Codigo acertado.");
            } else {
                System.out.println("Codigo fallado, vuelva a repetir "+i+" intento hasta 4");
            }
        }
        if (acertado == false) {
            System.out.println("Has fallado 4 veces, se cierra el programa");
        }
    }
}
