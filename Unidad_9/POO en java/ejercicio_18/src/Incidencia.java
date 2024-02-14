public class Incidencia {
    private static int incidenciasTotales = 0, arregladas = 0;
    private boolean resuelta = false;
    private String error,solucion;
    private int puesto, inciencia;

    Incidencia(int numeroPuesto, String error){
        setPuesto(numeroPuesto);
        setError(error);
        setIncidenciasTotales();
        setInciencia(getIncidenciasTotales());
    }

    public void resuelve(String solucion){
        setSolucion(solucion);
        setResuelta(true);
        setArregladas();
    }

    public static int getPendientes(){
        return (getIncidenciasTotales() - getArregladas());
    }

    @Override
    public String toString() {
        if (isResuelta()) {
            return "Incidencia "+getInciencia()+" - Puesto: "+getPuesto()+" - "+getError()+" - Resuelta - "+getSolucion();
        }
        return "Incidencia "+getInciencia()+" - Puesto: "+getPuesto()+" - "+getError()+" - Pendiente";
    }

    // si esta resuelto
    public boolean isResuelta() {
        return resuelta;
    }

    public void setResuelta(boolean resuelta) {
        this.resuelta = resuelta;
    }

    // el error 
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    // el puesto
    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    // soluciones
    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    // incidencias totales
    public static int getIncidenciasTotales() {
        return incidenciasTotales;
    }

    public static void setIncidenciasTotales() {
        Incidencia.incidenciasTotales++;
    }

    // incidendias sueltas
    public int getInciencia() {
        return inciencia;
    }

    public void setInciencia(int inciencia) {
        this.inciencia = inciencia;
    }

    public static void setIncidenciasTotales(int incidenciasTotales) {
        Incidencia.incidenciasTotales = incidenciasTotales;
    }

    // los arreglados
    public static int getArregladas() {
        return arregladas;
    }

    public void setArregladas() {
        this.arregladas++;
    }
}
