package personal;

import java.util.ArrayList;

public interface CRUD<T> {
    public ArrayList<T> solicitarTodos();
    public T solicitarUno(int id);
    public T anadir(T data);
    public T actualizar(int id, T data);
    public T borrar(int id);
}
