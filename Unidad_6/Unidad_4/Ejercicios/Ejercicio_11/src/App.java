public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int hora;
        int minutos;
        int segundos;

        // preguntas
        System.out.println("Ingrese la hora y minutos que estas para calcular cuanto le queda para media noche");

        // hora
        System.err.print("hora --> ");
        hora = Integer.parseInt(System.console().readLine());

        // minutos
        System.err.print("minutos --> ");
        minutos = Integer.parseInt(System.console().readLine());

        // calculos
        minutos = 60 - minutos;
        hora = 23 - hora;

        minutos = minutos * 60;
        hora = (hora * 60) * 60;

        segundos = hora + minutos;

        // resultado
        System.out.printf("----> %d segundos que quedan para medianoche", segundos);
    }
}
