public class Pizza {
    private static int pizzasPedidas;
    private static int pizzasServidas;
    
    private boolean servida = false;
    private String tipo, tamaño;
    
    Pizza(String tipo_p, String tamaño_p){
        tipo = tipo_p;
        tamaño = tamaño_p;
        pizzasPedidas++;
    }

    public String toString(){
        if (servida) {
            return "pizza "+tipo+" "+tamaño+", servida";
        }
        return "pizza "+tipo+" "+tamaño+", pedida";
    }

    public void sirve(){
        pizzasServidas++;
        servida = true;
    }

    public static int getTotalPedidas(){
        return pizzasPedidas;
    }

    public static int getTotalServidas(){
        return pizzasServidas;
    }
}
