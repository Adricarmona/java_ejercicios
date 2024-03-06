// Codigo por Adrian Carmona 1º DAM

import java.util.ArrayList;
import java.util.HashMap;

public class Diccionario {
    //El array list donde se generan y guardan las palabras en castellano
    ArrayList<String> espanol;
    //EL hashMap donde se se guarda todo el dicicionario 
    HashMap<String, ArrayList<String>> dicionario;

    /**
     * Genera el objeto diccionario para empezar a meterle los datos
     */
    Diccionario(){
        dicionario = new HashMap<String, ArrayList<String>>();
    }

    /**
     * Comprueba las palabras metidas de una palabra en el diccionario
     * @param ingles: Entrada del diccionario que quiere comprobar 
     */
    public void consularEntradas(String ingles){
        if (comprobarExistencia(ingles)) {
            System.out.println("\n-"+ingles+": "+dicionario.get(ingles));
        } else {
            System.out.println("\n#Error, palabra en ingles no econtrada.");
        }
    }

    /**
     * Añade una entrada al diccionario y si no existe lo genera
     * @param ingles: La palabra en ingles a añadir en el diccionario o a cual se refiere para meterle la palabra.
     * @param espanolIngresado: La palabra en español a meter en el diccionario
     */
    public void anadirEntradas(String ingles, String espanolIngresado){
        if (!dicionario.containsKey(ingles)) {
            espanol = new ArrayList<String>();
            espanol.add(espanolIngresado);
            dicionario.put(ingles, espanol);
        } else {
            espanol = dicionario.get(ingles);
            espanol.add(espanolIngresado);
        }
    }

    /**
     * Borra una entrada del diccionario
     * @param ingles: Entrada en el diccionario que quiere borrrar 
     */
    public void borrarEntradas(String ingles){
        if (comprobarExistencia(ingles)) {
            dicionario.remove(ingles);
        } else {
            System.out.println("\n#Error, palabra en ingles no econtrada.");
        }
    }

    /**
     * Borra una palabra en castellano en concreto pedida
     * @param ingles: La entrada en ingles de donde quieres borrrar la entrada en castellano
     * @param espanolIngresado: La entrada en castellano que quieres borrar
     */
    public void borrarEntradaConcreto(String ingles, String espanolIngresado){
        if (comprobarExistencia(ingles)) {
            espanol = dicionario.get(ingles);
            if (espanol.contains(espanolIngresado)) {
                espanol.remove(espanolIngresado);
            } else {
                System.out.println("\n#Error, palabra en español no econtrada.");
            }
        } else {
            System.out.println("\n#Error, palabra en ingles no econtrada.");
        }
    }

    /**
     * @param ingles: la calve que quiera comproar que existe
     * @return: devuelve un verdadero o falso si existe o no, escribiendo por pantalla el error si no existe
     */
    protected boolean comprobarExistencia(String ingles){
        if (!dicionario.containsKey(ingles)) {
            return false;
        }
        return true;
    }

    //GETTERS Y SETTERS 

    /**
     * @return: devuelve el arraylist
     */
    public ArrayList<String> getEspanol() {
        return espanol;
    }

    /**
     * cambia el arraylist por el ingresado
     * @param espanol: ingresa un arraylist
     */
    public void setEspanol(ArrayList<String> espanol) {
        this.espanol = espanol;
    }

    /**
     * @return: devuelve el dicicionario 
     */
    public HashMap<String, ArrayList<String>> getDicionario() {
        return dicionario;
    }

    /**
     * @param dicionario: ingresa un diccionario
     */
    public void setDicionario(HashMap<String, ArrayList<String>> dicionario) {
        this.dicionario = dicionario;
    }
}

