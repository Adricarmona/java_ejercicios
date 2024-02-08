public class Fraccion {
    private float numerador;
    private float denominador;

    // le mete los numeros
    public Fraccion(int n1, int n2) {
        numerador = n1;
        denominador = n2;
    }

    // divide los numeros
    public float divide() {
        return numerador / denominador;
    }

    // multiplica los numeros
    public float multiplica() {
        return numerador * denominador;
    }

    // los invierte de posicion
    public void invierte() {
        float tmp = numerador;
        numerador = denominador;
        denominador = tmp;
    }

    // los simplifica
    public void simplifica() {
        float dividir = maximoComunDivisor(numerador, denominador);
        numerador /= dividir;
        denominador /= dividir;
    }

    // hace el maximo comun divisior
    private float maximoComunDivisor(float numerador, float denominador) {
        float tmp;
        while (denominador != 0) {
            tmp = denominador;
            denominador = numerador % denominador;
            numerador = tmp;
        }
        return numerador;
    }

    // imprime numeros
    public void imprimir() {
        System.out.println(numerador+" "+denominador);
    }
}
