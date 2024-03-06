import java.util.HashMap;

public class Acceso {
    HashMap<String, String> datos = new HashMap<String, String>();

    Acceso(){
        System.out.println("->Inicializado");
    }

    Acceso(String usuarioC, String contrasenaC){
        anadirUsuario(usuarioC, contrasenaC);
    }

    public void preguntarUsuario(){
        System.out.print("Usuario: ");
        String usuario = System.console().readLine();
        if (datos.containsKey(usuario)) {
            String claves = datos.get(usuario);
            String contraPedida;
            int intentos = 3;
            boolean acertado = false;
            do {
                System.out.print("Contraseña: ");
                contraPedida = System.console().readLine();
                if (claves.equals(contraPedida)) {acertado = true;}
                if (!claves.equals(contraPedida)) {System.out.println("Contraseña erronea "+(intentos-1)+" intentos restantes\n");}
                intentos--;
                if (acertado) {
                    System.out.println("\n##############");
                    System.out.println("# Bienvenido #");
                    System.out.println("##############");
                }
            } while (!acertado && intentos > 0);
        } else {
            System.out.println("No existe ese usuario.");
        }

    }

    public void anadirUsuario(String usuario, String contrasena){
        if (usuario == "" | contrasena == "") {
            System.out.println("No se permiten datos vacios.");
        } else {
        datos.put(usuario, contrasena);
        }
    }
}
