public class Movil extends Terminal{
    private float precio;
    private String tipo;

    Movil(String movil, String tarifa){
        super(movil);
        tipo = tarifa;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void llama(Terminal terminal,int tiempoLlamada){
        setDuracion(getDuracion() + tiempoLlamada);
        terminal.llama(tiempoLlamada);
        switch (getTipo()) {
            case "rata":
                precio += ((float)tiempoLlamada / 60) * 6; 
                break;
            case "mono":
                precio += ((float)tiempoLlamada / 60) * 12;
                break;
            case "bisonte":
                precio += ((float)tiempoLlamada / 60) * 30;
            default:
        }
    }

    @Override
    public String toString() {
        return "Nº "+getCodigoTerminal()+" - "+getDuracion()+"s de conversación - tarificados "+String.format("%2.2f", precio/100) +" euros";
    }
}
