package matematicas;

public class matematicas  {

    /*
     * Comprueba que el numero sea capicua
     */
    public static boolean esCapicua(int num) {
        int alreves = voltea(num); // le da la vuelta al numero

        // le pasa una vuelta por si no es capicua
        boolean capicua = true; 
        for (int i = 10; num/i > 0; i*=10) {
            if (num%i != alreves%i) {capicua = false;}
        }

        return capicua;
    }

    /*
    * Comprueba si el numero es primo
    */
    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if ((num%i) == 0)
                primo = false;
        }
        return primo;
    }

    /*
     *  devuelve el siguiente numero primo mayor al indicado
     */
    public static int siguientePrimo(int num) {
        boolean primo = esPrimo(num);
        while (primo == false) {
            num++;
            primo = esPrimo(num);
        }
        return num;
    }

    /*
     * devuelve una potencia, dada una base y un exponente
     */
    public static int potencia(int base, int exponente) {
        if (exponente == 0)
            return 1;
        int total = base;    
        for (int i = 1; i < exponente; i++) {
            total *= base;
        }
        return total;
    }

    /*
     * cuenta cuantos digitos tiene un numero entero
     */
    public static int digitos(int num) {
        int logitud = 0;
        for (int i = num; i > 0; i/=10) {
            logitud++;
        }
        return logitud;
    }

    /*
     * le da la vuelta a un numero (el primero el ultimo y el ultimo el primero)
     */
    public static int voltea(int num) {
        int alreves = 0; 
        for (int i = num; i > 0; i/=10) {
            alreves *= 10;
            alreves = alreves + (i % 10);
        }
        return alreves;
    }

    /*
     * devuelve el numerom que hay en la posicion indicada de un numero indicado
     */
    public static int digitoN(int pos, int num) {
        num = voltea(num);
        for (int i = 0; i < pos; i++) {
            num /= 10;
        }
        return (num%10);
    }

    /*
     *  da la posicion de un numero indicado sobre otro numero , si no esta devuelve -1
     */
    public static int posicionDeDigito(int numEncontrar, int num) {
        int pos = 0;
        num = voltea(num);
        while (num > 0) {
            if (num%10 == numEncontrar) {return pos;}
            pos++;
            num/=10;
        }
        return -1;
    }

    /*
     *  quita una cantidad de numeros indicada por detras de otro indicado
     */
    public static int quitaPorDetras(int posBorrar, int num) {
        while (posBorrar > 0) {
            num/=10;
            posBorrar--;
        }
        return num;
    }

    /*
     *  quita una cantidad de numeros indicada por delante de otro indicado
     */
    public static int quitaPorDelante(int posBorrar, int num) {
        num = voltea(num);
        while (posBorrar > 0) {
            num/=10;
            posBorrar--;
        }
        return voltea(num);
    }

    /*
     * añade numeros por atras del numero indicando los que vas a añadir y los añadidos
     */
    public static int pegaPorDetras(int numAñadir, int num) {
        numAñadir = voltea(numAñadir);
        num = (num*10) + (numAñadir%10);
        return num;
    }

    /*
     * añade numeros por delante del numero indicando los que vas a añadir y los añadidos
     */
    public static int pegaPorDelante(int numAñadir, int num) {
        num = voltea(num);
        numAñadir = (numAñadir*10) + (num%10);
        return numAñadir;
    }

    /*
     *  metes dos posiciones y devuelve los numeros entre esas posiciones ingresando
     * las posiciones y el numero
     */
    public static int trozoDeNumero(int pripos, int secpos, int num) {
        while (secpos > 0) {
            num/=10;
            secpos--;
        } // la parte de atras del numero
        num = voltea(num);
        while (pripos > 0) {
            num/=10;
            pripos--;
        } // la parte de alantes
        return voltea(num);
    }

    /*
     *  pega dos numeros para formar uno
     */
    public static int juntaNumeros(int numdos, int numuno) {
        numuno = voltea(numuno);
            while (numuno > 0) {
                numdos = (numdos*10) + (numuno%10);
                numuno/=10;
            }
            return numdos;
    }
}