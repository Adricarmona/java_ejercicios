public class App {
    public static void main(String[] args) throws Exception {
        // variables 
        String dia;

        // progrmama
        System.out.println("Escriba un un dia de la semana para saber a que ejercicio tienes a primera");
        System.out.printf("(en minusculas) --> ");
        dia = (System.console().readLine());
        switch (dia) {
            case "lunes":
            case "martes":
                System.out.println("SNIF");
            break;
            case "miercoles":
                System.out.println("BADAT");
            break;
            case "jueves":
                System.out.println("LMSGI");
            break;
            case "viernes":
                System.out.println("BADAT");
            break;
            case "sabado":
            case "domingo":
                System.out.println("No hay clase");
            break;
            default:
                System.out.println("Error en la escritura, vuelvalo a escribir");
                break;
        }
    }
}