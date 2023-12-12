public class App {
    public static void main(String[] args) throws Exception {
        // declaramos las variables
        System.out.printf("Escriba el primer numero: ");
        int x = Integer.parseInt( System.console().readLine() );
        System.out.printf("Escriba el segundo numero: ");
        int y = Integer.parseInt( System.console().readLine() );
        double resultado;

        // la suma
        resultado = x + y;
        System.out.printf("la suma de %d y %d es: %d \n",x ,y ,(int)resultado );

        // la resta
        resultado = x - y;
        System.out.printf("la resta de %d y %d es: %d \n",x ,y ,(int)resultado );

        // la multiplicacion
        resultado = x * y;
        System.out.printf("la multiplicacion de %d y %d es: %d \n",x ,y ,(int)resultado );

        // la division
        resultado = (double)x / (double)y;
        System.out.printf("la suma de %d y %d es: %f \n",x ,y ,resultado );
    }
}