public class PruebaLibreto {
    public static void main(String[] args) throws Exception {
        System.out.println("########## Inserte libretos ##########");
        
        // Entramos en el primer "try" que pregunta el codigo y año del libreto, estan dentro del mismo try
        // por que los dos piden valores enteros 
        try {
            System.out.print("Codigo ->");
            int codigo = Integer.parseInt(System.console().readLine());
            System.out.print("Año ->");
            int anyo = Integer.parseInt(System.console().readLine());
            
            // Entramos en el segundo "try" , comprobamos que el dato ingresado no sea un dato vacio o un espacio solo
            // y que no se ingrese una cadena de caracteres no valida
            try {
                String titulo = "";
                do {
                    System.out.print("Titulo ->");
                    titulo = System.console().readLine();
                    if (titulo == "" || titulo == " ") {System.out.println("No se acepta datos vacios");}
                } while (titulo == "" || titulo == " ");

                // generamos el objeto libro con los datos ingresados
                Libreto libro = new Libreto(codigo,anyo,titulo);

                // y imrpimimos el libro
                System.out.println(libro);
            } catch (Exception e) {
                System.out.println("Cadena de caracteres no valida");
            }
        } catch (Exception e) {
            System.out.println("Se esperaba un numero");
        } finally { // utilizamos el finally para escribir el mensaje siempre aun que de error
            System.out.println("Gracias por usar");
        }
    }
}
