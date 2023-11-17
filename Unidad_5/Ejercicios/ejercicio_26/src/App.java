public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0; // el numero ingresado
        int dig = 0; // el digito a encontrar en el numero
        int tmp = 0; // hacemos tmp para meter a num y ir modificando el valor
        int pos = 1; // indica la posicion donde se indica el digito

        // titulo y pregunta del numero
        System.out.println("Ejercicio_26");
        System.out.println("------------");
        System.out.print("ingresa un numero ->");
        num = Integer.parseInt(System.console().readLine());
        System.out.print("ingresa un digito a encontrar ->");
        dig = Integer.parseInt(System.console().readLine());

        // Le damos la vuelta al numero
        for (int i = num; i > 0; i=i/10) {tmp = (tmp * 10) + (i % 10);}

        //comprobamos el numero , siendo el numero invertido detecta las posiciones en orden por que nosotros leemos de izquierda a derecha pero este programa de derecha a izquierda
        for (int i = tmp; i > 0; i=i/10) {
            if ((i % 10) == dig) {System.out.print(pos+" posicion ");} // imprimimos las posiciones que coinciden
            pos++;
        }
        System.out.print("\nEn el numero "+num+" de "+dig+"\n");// para el texto final
    }
}
