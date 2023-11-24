public class App {
    public static void main(String[] args) throws Exception {
        int num = 0; // el numero que ingresamos
        do{
        System.out.println("ejercicio_38");
        System.out.print("Por favor, introduzca la altura del reloj de arena: ");
        num = Integer.parseInt(System.console().readLine()); 
        if (num < 3) {System.out.println("Error en la ingresion del numero, tiene que ser mayor de 3");} // mensaje de error si es menor de 3   
        } while (num < 2);
        int anchura = num; // anchura tendra la cantidad de num
        int altura = num; // num sera altura 

        // parte de arriba
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < num - anchura ; j++) {System.out.print("#");} // espacios
            for (int j = 0; j < anchura - i; j++) {System.out.print("*");} // asteriscos
            System.out.println(""); // salto de linea
            anchura -= 1; // le quitamos uno anchura a la arena
        }
        // parte de abajo
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <  anchura - i ; j++) {
                System.out.print("#");
            }

            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println(""); // salto de linea
            anchura += 1; // le quitamos dos anchura a la arena
        }
    }
}
