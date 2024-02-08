public class Test {
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(5,15);
        fraccion.imprimir();
        System.out.println(fraccion.divide());
        System.out.println(fraccion.multiplica());
        fraccion.invierte();
        fraccion.imprimir();
        fraccion.invierte();
        fraccion.simplifica();
        fraccion.imprimir();
    }
}
