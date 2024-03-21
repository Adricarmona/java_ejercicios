package personal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Usuarios implements CRUD<Usuario>{
    private String file;
    private int nextId;
    
    public Usuarios(String file) throws Exception{
        this.file = file;
        File _file = new File(file);
        if(!_file.exists())
            _file.createNewFile();

        

        //  TODO tienes que leer el archivo para obtener el siguiente id disponible...
        // nextId almacena el siguiente id a configurar para cuando se añada un nuevo usuario
        // Por ejempo: Si tienes x usuarios y el último es el usuario 8 entonces nextId debe valer 9
        // Podrías hacer uso de la función solicitarTodos "es solo una sugerencia"
    }
    
    public String getFile() {
        return file;
    }

    @Override
    public ArrayList<Usuario> solicitarTodos() {
        ArrayList<Usuario> usuariosArray = new ArrayList<Usuario>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(getFile()));

            String linea = "";
            Usuario usuarioActual;
            do {
                linea = br.readLine();
                usuarioActual = new Usuario(linea);
                usuariosArray.add(usuarioActual);
            } while (linea != null);

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: no se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error: no se acepta el archivo");
        }

        return usuariosArray;
    }

    @Override
    public Usuario solicitarUno(int id){
        //  TODO Tienes que poder buscar en el archivo al usuario cuyo id se suministra
        // y devolver un objeto Usuario
        // si el usuario no está debe devolver null
        return null;
    }

    @Override
    public Usuario anadir(Usuario datos){
       //  TODO Tienes que poder añadir un usuario al archivo
       // Debes comprobar que el usuario no existe (no puede haber dos usuarios con el mismo email)
       // En el caso de que ya existiera debe devolver un null
       // Si el usuario no existe entonces podemos añadir al usuario
       // Para que puedas añadir al usuario al final del archivo debes pasar un true cuando llames
       // al constructor de new FileWriter(nombre, true)
        return null;
    }

    @Override
    public Usuario actualizar(int id, Usuario data){
        //  TODO Tienes que devolver los datos del usuario actualizados
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces modificamos ese usuario en esa posición
        // del archivo.
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // modificar escribes los datos de ese usuario
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás modificado los datos de ese usuario 
        return null;
    }

    @Override
    public Usuario borrar(int id){
        //  TODO Tienes que devolver los datos del usuario borrado
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces eliminamos esa línea del archivo
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // borrar te saltas la escritura de esa línea
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás borrado al usuario
        return null;
    }
}
