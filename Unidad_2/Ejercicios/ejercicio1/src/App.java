public class App {
    public static void main(String[] args) throws Exception {
        // declaramos las variables
        int x = 144;
        int y = 999;
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
