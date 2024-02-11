public class Terminal{
    private String codigoTerminal;
    private int duracion;

    Terminal(String codigo){
        codigoTerminal = codigo;
    }

    public String getCodigoTerminal(){
        return codigoTerminal;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setDuracion(int n){
        duracion = n;
    }

    public void llama(Terminal terminal,int tiempoLlamada){
        duracion = duracion + tiempoLlamada;
        terminal.llama(tiempoLlamada);
    }

    public void llama(int tiempoLlamada){
        duracion = duracion + tiempoLlamada;
    }

    public String toString() {
        return "Nº "+codigoTerminal+" - "+duracion+"s de conversación";
    }
}
