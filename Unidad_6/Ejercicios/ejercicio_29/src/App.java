public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 29");

        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int estacion = Integer.parseInt(System.console().readLine());

        int Temperatura_minima = 0;
        int Temperatura_maxima = 0;
        int estado_del_cielo = 0;
        switch (estacion) {
            case 1:
                Temperatura_minima = (int)(Math.random() * 15);
                Temperatura_maxima = (int)(Math.random() * (15 - Temperatura_minima) + (Temperatura_minima + 15));
                Temperatura_minima += 15; // le añadimos 15 por que es la temperatura minima
                estado_del_cielo = (int)(Math.random() * 20 + 40);
                break;
        
            default:
                break;
        }
        System.out.println(""); // salto de linea para que quede como el ejemplo
        System.out.println("revisión del tiempo para mañana");
        System.out.println("-------------------------------");
        System.out.print("Temperatura mínima: ");

    }
}
