package personal;

public interface Serializador {
    
    /** Serializa los datos de un usuario en un String de la siguiente forma:
     *  id;nombre;apellidos;email;contraseña
     *  Útil para salvar los datos de un usuario y luego ser deserializados
     * @return String conteniendo los datos del usuario
     */
    public String serializar();


    /** Deserializa los datos de un usuario configurando los datos de la instancia actual
     *  Los datos se reciben de la forma:
     *  id;nombre;apellidos;email;password
     *  Útil para leer la información que previamente se serializó
     * @param datos datos de un usuario
     */
    public void deserializar(String datos);
}
