import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int total = 0;
        String respuesta;
        
        // titulo
        System.out.println("Cuestionario sobre el tema");
        
        // pregunta 1
        System.out.printf("1º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a"))
            total = total + 1;

        // pregunta 2
        System.out.printf("2º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a"))
            total = total + 1;

        // pregunta 3
        System.out.printf("3º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) 
            total = total + 1;
        
        // pregunta 4
        System.out.printf("4º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) 
            total = total + 1;

        // pregunta 5
        System.out.printf("5º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) 
            total = total + 1;

        // pregunta 6
        System.out.printf("6º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) 
            total = total + 1;

        // pregunta 7
        System.out.printf("7º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) 
            total = total + 1;

        // pregunta 8
        System.out.printf("8º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a"))
            total = total + 1;

        // pregunta 9
        System.out.printf("9º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) 
            total = total + 1;

        // pregunta 10
        System.out.printf("10º (pregunta) (a)verdadera) (b)falsa) --> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) 
            total = total + 1;

        // Respuesta final
        System.out.println("Sus totales de los puntos son "+total+" sobre 10");
    }
}