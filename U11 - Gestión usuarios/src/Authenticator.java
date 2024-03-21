import java.util.ArrayList;
import java.util.Scanner;

import personal.Usuario;
import personal.Usuarios;

public class Authenticator {
    public static String obtenerNombreDeArchivo(String[] args) {
        if (args.length > 0) {
            return args[0];
        } else {
            return "";
        }
        // TODO Comprueba que viene el argumento y devuelve el nombre del archivo en caso correcto
    }
    public static void main(String[] args){
        String file;
        if( (file = obtenerNombreDeArchivo(args)).equals("")){
            System.out.println("No se ha ingresado ningun parametro");
        }
        
        Scanner sc = new Scanner(System.in);
        try {
            Usuarios usuarios = new Usuarios(file);
            boolean salir = false;
            Usuario usuarioAutenticado = null;
            String nombre, apellidos, email, contrasena;
            do {
                if(usuarioAutenticado==null){
                    System.out.println("********** Authenticator **********");
                    System.out.println("1. Iniciar sesión");
                    System.out.println("2. Registrar usuario");
                    System.out.println("3. Listar usuarios");
                    System.out.println("4. Salir");    
                    int opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("Email: ");
                            while((email = sc.nextLine()).equals(""));

                            System.out.println("Contraseña: ");
                            while((contrasena = sc.nextLine()).equals(""));
                            ArrayList<Usuario> _usuarios = usuarios.solicitarTodos();
                            if(_usuarios!=null)
                                for(Usuario usuario: _usuarios){
                                    if(usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena)){
                                        usuarioAutenticado = usuario;
                                        break;
                                    }
                                }
                            if(usuarioAutenticado!=null){
                                System.out.println("\n****************************");
                                System.out.printf("Bienvenido %s %s",usuarioAutenticado.getNombre(),usuarioAutenticado.getApellidos());
                                System.out.println("\n****************************");
                            }
                            else{
                                System.out.println("No se ha podido iniciar sesión con las credenciales suministradas");
                            }
                            break;
                        case 2:
                            System.out.println("Nombre: ");
                            while((nombre = sc.nextLine()).equals(""));
                            
                            System.out.println("Apellidos: ");
                            while((apellidos = sc.nextLine()).equals(""));

                            System.out.println("Email: ");
                            while((email = sc.nextLine()).equals(""));

                            System.out.println("Contraseña: ");
                            while((contrasena = sc.nextLine()).equals(""));
                            usuarioAutenticado = usuarios.anadir(new Usuario(0,nombre, apellidos, email, contrasena));
                            if(usuarioAutenticado != null){
                                System.out.println("Se ha registrado correctamente");
                                System.out.println("\nSus datos ********************");
                                System.out.println(usuarioAutenticado);
                                System.out.println("******************************\n");
                            }
                            else
                                System.out.println("Ocurrió un error al registrarse");
                            break;
                        case 3:
                            ArrayList<Usuario> listado = usuarios.solicitarTodos();
                            System.out.println("\n***** Listado de usuarios *****");
                            if(listado != null){
                                for(Usuario usuario:listado)
                                    System.out.println(usuario);
                                
                            }
                            else{
                                System.out.println("No hay usuarios registrados");
                            }
                            System.out.println("*******************************\n");
                            break;
                        case 4:
                            salir = true;
                            break;
                        default:
                            break;
                    }
                }
                else{
                    System.out.println("********** Authenticator **********");
                    System.out.println("Usuario: "+usuarioAutenticado);
                    System.out.println("1. Modificar mis datos");
                    System.out.println("2. Cerrar sesión");
                    System.out.println("3. Eliminar mi cuenta");    
                    int opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("Nombre: (Pulse intro si no desea cambiar el nombre)");
                            nombre = sc.nextLine();
                            if(!nombre.equals(""))
                                usuarioAutenticado.setNombre(nombre);
                            System.out.println("Apellidos: (Pulse intro si no desea cambiar los apellidos)");
                            apellidos = sc.nextLine();
                            if(!apellidos.equals(""))
                                usuarioAutenticado.setApellidos(apellidos);
                            if(!nombre.equals("") || !apellidos.equals("")){
                                usuarios.actualizar(usuarioAutenticado.getId(), usuarioAutenticado);
                                System.out.println("Se han actualizado correctamente sus datos");
                            }
                            break;
                        case 2:
                            usuarioAutenticado = null;
                            System.out.println("Ha cerrado la sesión");
                            break;
                        case 3:
                            usuarios.borrar(usuarioAutenticado.getId());
                            usuarioAutenticado = null;
                            break;
                        default:
                            break;
                    }
                }
                
            } while (!salir);
            System.out.println("Hasta luego!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
