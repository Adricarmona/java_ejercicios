package ejercicio_6.src;

public class Tiempo {
    
    /**
     * las horas minutos y segundos
     */
    private int hora, minutos, segundos;

    /**
     * @param hora_i: las horas a meter en el parametro
     * @param minutos_i: los minutos a meter en el parametro
     * @param segundos_i:  los segundos a meter en el parametro
     */
    Tiempo(int hora_i,int minutos_i,int segundos_i){
        if (hora_i >= 0 && minutos_i >= 0 && segundos_i >= 0) {
            hora = hora_i;
            if (minutos_i > 60) {
                hora++;
                minutos_i -= 60;
            }
            minutos = minutos_i;
            if (segundos_i > 60) {
                minutos_i++;
                segundos_i -= 60;
            }
            segundos = segundos_i;
        } else {
            hora_i = 0;
            minutos_i = 0;
            segundos_i = 0;
            System.out.println("No se admiten numeros negativos, se indica 0");
        }
    }
    

    /**
     * resta las horas, minutos y segundos
     * @param hora_i: las horas a restar a los ingresados 
     * @param minutos_i: los minutos a restar a los ingresados
     * @param segundos_i: los segundos a restar a los ingresados
     */
    public void resta(int hora_i,int minutos_i,int segundos_i){
        if (hora_i >= 0 && minutos_i >= 0 && segundos_i >= 0) {
            segundos -= segundos_i;
            while (segundos < 0) {
                segundos += 60;
                minutos--;
            }

            minutos -= minutos_i;
            while (minutos < 0) {
                minutos += 60;
                hora--;
            }

            hora -= hora_i;
        } else {
            System.out.println("No se puede restar numeros negativos");
        }
    }

    /**
     * suma las horas, minutos y segundos
     * @param hora_i: las horas a sumar a los ingresados 
     * @param minutos_i: los minutos a sumar a los ingresados 
     * @param segundos_i: los segundos a sumar a los ingresados 
     */
    public void suma(int hora_i,int minutos_i,int segundos_i){
        if (hora_i >= 0 && minutos_i >= 0 && segundos_i >= 0) {
            segundos += segundos_i;
            while (segundos > 59) {
                segundos -= 60;
                minutos++;
            }

            minutos += minutos_i;
            while (minutos > 59) {
                minutos -= 60;
                hora++;
            }

            hora += hora_i;
        } else {
            System.out.println("No se puede sumar numeros negativos");
        }
    }

    public String toString() {
        return "Tiempo " + hora + "H " + minutos + "m " + segundos + "s";
    }
}
