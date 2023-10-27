public class App {
    public static void main(String[] args) throws Exception {
        // preguntas y iniciando variables dias y mes
        System.out.println("Programa que te dice que horoscopo eres.");
        System.out.printf("Indica el dia que naciste --> ");
        int dias = Integer.parseInt(System.console().readLine());
        System.out.printf("Indica el mes que naciste (en numero) --> ");
        int mes = Integer.parseInt(System.console().readLine());

        // haciendo el calculo
        switch (mes) {
            case 1:
                if (dias >= 1 && dias <= 20) {
                    System.err.println("Usted es: Capricornio");
                } else if (dias >= 21 && dias <= 31) {
                    System.err.println("Usted es: Acuario");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 2:
                if (dias >= 1 && dias <= 18) {
                    System.err.println("Usted es: Acuario");
                } else if (dias >= 19 && dias <= 28) {
                    System.err.println("Usted es: Piscis");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 3:
                if (dias >= 1 && dias <= 20) {
                    System.err.println("Usted es: Piscis");
                } else if (dias >= 21 && dias <= 31) {
                    System.err.println("Usted es: Aries");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 4:
                if (dias >= 1 && dias <= 21) {
                    System.err.println("Usted es: Aries");
                } else if (dias >= 22 && dias <= 30) {
                    System.err.println("Usted es: Tauro");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 5:
                if (dias >= 1 && dias <= 20) {
                    System.err.println("Usted es: Tauro");
                } else if (dias >= 21 && dias <= 31) {
                    System.err.println("Usted es: Géminis");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 6:
                if (dias >= 1 && dias <= 20) {
                    System.err.println("Usted es: Géminis");
                } else if (dias >= 21 && dias <= 30) {
                    System.err.println("Usted es: Cancer");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 7:
                if (dias >= 1 && dias <= 22) {
                    System.err.println("Usted es: Cancer");
                } else if (dias >= 23 && dias <= 31) {
                    System.err.println("Usted es: Leo");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 8:
                if (dias >= 1 && dias <= 22) {
                    System.err.println("Usted es: Leo");
                } else if (dias >= 23 && dias <= 31) {
                    System.err.println("Usted es: Virgo");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 9:
                if (dias >= 1 && dias <= 22) {
                    System.err.println("Usted es: Virgo");
                } else if (dias >= 23 && dias <= 30) {
                    System.err.println("Usted es: Libra");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 10:
                if (dias >= 1 && dias <= 22) {
                    System.err.println("Usted es: Libra");
                } else if (dias >= 23 && dias <= 31) {
                    System.err.println("Usted es: Escorpio");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 11:
                if (dias >= 1 && dias <= 21) {
                    System.err.println("Usted es: Escorpio");
                } else if (dias >= 22 && dias <= 30) {
                    System.err.println("Usted es: Sagitario");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            case 12:
                if (dias >= 1 && dias <= 21) {
                    System.err.println("Usted es: Sagitario");
                } else if (dias >= 22 && dias <= 31) {
                    System.err.println("Usted es: Capricornio");
                } else {
                    System.err.println("Error en el dia ingresado");
                }
                break;
            default:
                System.err.println("Error en el mes ingresado");
                break;
        }
    }
}
