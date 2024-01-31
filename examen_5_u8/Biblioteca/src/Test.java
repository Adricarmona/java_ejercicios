import unidad8.numeros.Cifras; // contieneCifras(numerolargo, numero)
import unidad8.arrays1d.Filtros; // filtraConCifra (array, numero)
import unidad8.arrays2d.Elementos; // aleatorioDeArray2D (arrayBi)

public class Test {
    /*
     * utilizo la funcion main para comprobar que todas funcionan y no dan error a la vez
     * Cuando imprime funciona 1 es que no ha dado error el programa
     */
    public static void main(String[] args) throws Exception {
        Cifras.contieneCifra(12345, 2);
        System.err.println("Funciona 1");

        int[] test1 = {3,9,7};
        int[] test01 = Filtros.filtraConCifra(test1, 3);
        System.err.println("Funciona 2");
        
        
        int[][] test2 = {{3,9,7},{5,6,8}};
        int test02 = Elementos.aletorioDeArray2D(test2);
        System.err.println("Funciona 3");
    }
}
