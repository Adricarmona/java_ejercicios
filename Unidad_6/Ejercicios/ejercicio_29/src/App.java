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
        int cielo = 0;
        String nube = "";
        int tmp;
        switch (estacion) {
            case 1:
                Temperatura_minima = (int)(Math.random() * 15 + 15);
                Temperatura_maxima = (int)(Math.random() * 15 + 15);
                if (Temperatura_minima > Temperatura_maxima) {
                    tmp = Temperatura_maxima;
                    Temperatura_maxima = Temperatura_minima;
                    Temperatura_minima = tmp;
                }
                cielo = (int)(Math.random() * 10);
                    if (cielo > 6) {
                        nube = "Nublado";
                    } else {
                        nube = "Soleado";
                    }
                break;
            case 2:
                Temperatura_minima = (int)(Math.random() * 20 + 25);
                Temperatura_maxima = (int)(Math.random() * 20 + 25);
                if (Temperatura_minima > Temperatura_maxima) {
                    tmp = Temperatura_maxima;
                    Temperatura_maxima = Temperatura_minima;
                    Temperatura_minima = tmp;
                }
                cielo = (int)(Math.random() * 10);
                    if (cielo > 8) {
                        nube = "Nublado";
                    } else {
                        nube = "Soleado";
                    }
                break;
            case 3:
                Temperatura_minima = (int)(Math.random() * 10 + 20);
                Temperatura_maxima = (int)(Math.random() * 10 + 20);
                if (Temperatura_minima > Temperatura_maxima) {
                    tmp = Temperatura_maxima;
                    Temperatura_maxima = Temperatura_minima;
                    Temperatura_minima = tmp;
                }
                cielo = (int)(Math.random() * 10);
                    if (cielo > 4) {
                        nube = "Nublado";
                    } else {
                        nube = "Soleado";
                    }
                break;
            case 4:
                Temperatura_minima = (int)(Math.random() * 25);
                Temperatura_maxima = (int)(Math.random() * 25);
                if (Temperatura_minima > Temperatura_maxima) {
                    tmp = Temperatura_maxima;
                    Temperatura_maxima = Temperatura_minima;
                    Temperatura_minima = tmp;
                }
                cielo = (int)(Math.random() * 10);
                    if (cielo > 2) {
                        nube = "Nublado";
                    } else {
                        nube = "Soleado";
                    }
                break;
            default:
        }

        
        System.out.println(""); // salto de linea para que quede como el ejemplo
        System.out.println("revisión del tiempo para mañana");
        System.out.println("-------------------------------");
        System.out.println("Temperatura mínima: "+Temperatura_minima+"ºC");
        System.out.println("Temperatura máxima: "+Temperatura_maxima+"ºC");
        System.out.println(nube);

    }
}
