public class App {
    public static void main(String[] args) throws Exception {
        // variables
        String dia_str = ""; // la palabra en string para transformarla a numero
        int dia1 = 0; // palabra del primer dia
        int hora1 = 0; // hora del primer dia preguntado
        int dia2 = 0; // palabra del segundo dia
        int hora2 = 0; // hora del segundo dia preguntado
        int horat = 0; // la hora total
        int diat = 0; // el dia total

        // titulo y preguntas del dia
        System.out.println("Ejercicio_30");
        // 1º
        do {
            System.out.println("Por favor, introduzca la primera hora.");
            System.out.print("Día:"); // dia del primera pregunta
            dia_str = System.console().readLine();
            System.out.print("Hora:"); // horas del primer dia
            hora1 = Integer.parseInt(System.console().readLine());
            dia1 = dias(dia_str); // entrando a la funcion para comprobar el dia que es
            System.out.println("");
            dia_str = ""; // para poner el string vacio por si da error
        if (dia1 == 0 || hora1 > 23 || hora1 < 0) {System.out.println("Error en la optencion de datos, vuelva a intentarlo");}
        } while (dia1 == 0 || hora1 > 23 || hora1 < 0);

        // 2º
        do {
            System.out.println("Por favor, introduzca la segunda hora.");
            System.out.print("Día:"); // dia de la segunda pregunta
            dia_str = System.console().readLine();
            System.out.print("Hora:"); // horas del segundo dia
            hora2 = Integer.parseInt(System.console().readLine());
            dia2 = dias(dia_str); // entrando a la funcion para comprobar el dia que es
            if (dia1 == 0 || hora2 > 23 || hora2 < 0) {System.out.println("Error en la optencion de datos, vuelva a intentarlo");}
        } while (dia2 == 0 || hora2 > 23 || hora2 < 0);

        // hacemos los calculos de las horas
        if (dia1 < dia2 || (dia1 == dia2 && hora1 <= hora2)) {
            if (dia1 == dia2) { // calculamos si los dias son iguales
                    horat = hora2 - hora1;
            } else { // calculamos las horas si los dias son diferentes
                horat = hora2 - hora1;
                diat = dia2 - dia1;
                horat = horat + ( diat * 24 );
            }
            System.out.println("Entre las "+hora1+":00h del "+dia1+" y las "+hora2+":00h del "+dia2+" hay "+horat+" hora/s.");
        } else {
            System.err.println("El 1º dia es mas lejano que el 2º dia");
        }
    }

    public static int dias(String dia) {
        switch (dia) {
            case "Lunes":
            case "lunes":
            case "1":
                return 1; // si es lunes entra aqui
            case "Martes":
            case "martes":
            case "2":
                return 2; // si es martes entra aqui   
            case "Miercoles":
            case "miercoles":
            case "3":
                return 3; // si es miercoles entra aqui
            case "Jueves":
            case "jueves":
            case "4":
                return 4; // si es Jueves entra aqui
            case "Viernes":
            case "viernes":
            case "5":
                return 5; // si es Viernes entra aqui
            case "Sabado":
            case "sabado":
            case "6":
                return 6; // si es Sabado entra aqui
            case "Domingo":
            case "domingo":
            case "7":
                return 7; // si es Domingo entra aqui
            default:
                return 0; // si no es ninguno de los parametros recive 0
        }
    }
}
