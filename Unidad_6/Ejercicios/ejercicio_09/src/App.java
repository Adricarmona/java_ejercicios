public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 9");
        int num_generado = 0;
        int num_totales = 0;
        do {    
            num_generado = (int)((Math.random()*50)*2);
            System.out.print(num_generado+" ");
            num_totales++; // contador de numeros totales
        } while (num_generado != 24); // generamos los numeros hasta que sea 24 
        System.out.println("Se han generado "+num_totales); // pintamos los numeros
    }
}
