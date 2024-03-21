package personal;

/** Clase Usuario
 *  Clase que mantiene información de un usario
 */
public class Usuario implements Serializador{
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private String contrasena;

    /** Constructor desde un string
     * 
     * Este constructor es capaz de inicializar los datos del usuario
     * desde un string conteniendo la información de la siguiente manera:
     * id;nombre;apellidos;email;contraseña
     * Ejemplo:
     * 5;Juan Miguel;Romero Castillo;jmroca@g.educaand.es;1234
     * @param datos String conteniendo los datos
     * @throws NumberFormatException Eleva esta excepción si el identificado del usuario no es un número
     */
    public Usuario(String datos) throws NumberFormatException{
        this.deserializar(datos);   
    }

    /** Constructor pasando cada uno de los campos del usuario
     * 
     * @param id Identificador del usuario
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del usuario
     * @param email Email del usuario
     * @param contrasena Contraseña del usuario
     */
    public Usuario(int id, String nombre, String apellidos, String email, String contrasena){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.contrasena = contrasena;
    }

    /** Constructor de copia
     * Este constructor recibe como parámetro otro usuario y clona su información
     * @param usuario Usuario desde donde copiar la información
     */
    public Usuario(Usuario usuario){
        this.id = usuario.id;
        this.nombre = usuario.nombre;
        this.apellidos = usuario.apellidos;
        this.email = usuario.email;
        this.contrasena = usuario.contrasena;
    }

    /** Devuelve el id del usuario
     * 
     * @return Devuelve el id del usuario
     */
    public int getId() {
        return id;
    }

    /** Configura el id del usuario
     * 
     * @param id Identificador nuevo del usuario
     */
    public void setId(int id) {
        this.id = id;
    }

    /** Devuelve el nombre del usuario
     * 
     * @return El nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /** Configura el nombre del usuario
     * 
     * @param nombre Nombre del usuario a configurar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Devuelve los apellidos del usuario
     * 
     * @return Los apellidos del usuario
     */
    public String getApellidos() {
        return apellidos;
    }

    /** Configura los apellidos del usuario
     * 
     * @param apellidos Apellidos del usuario a configurar
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /** Devuelve el email del usuario
     * 
     * @return El email del usuario
     */
    public String getEmail() {
        return email;
    }

    /** Configura el email del usuario
     * 
     * @param email email del usuario a configurar
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Devuelve la contraseña del usuario
     * 
     * @return La contraseña del usuario
     */
    public String getContrasena() {
        return contrasena;
    }

    /** Configura la contraseña del usuario
     * 
     * @param contrasena La contraseña del usuario a configurar
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public boolean equals(Object o){
        return this==o || (this.getClass()==o.getClass() && this.id == ((Usuario)o).id);
    }

    @Override
    public String serializar() {
        return String.format("%d;%s;%s;%s;%s", this.id, this.nombre, this.apellidos, this.email, this.contrasena);
    }

    @Override
    public void deserializar(String datos) {
        String[] datosUsuario = datos.split(";");
        this.id = Integer.parseInt(datosUsuario[0]);
        this.nombre = datosUsuario[1];
        this.apellidos = datosUsuario[2];
        this.email = datosUsuario[3];
        this.contrasena = datosUsuario[4]; 
    }

    @Override
    public String toString(){
        return String.format("ID(%d) Nombre(%s, %s) Email(%s)", this.id, this.apellidos, this.nombre, this.email);
    }
}
