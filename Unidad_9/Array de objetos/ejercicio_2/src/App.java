public class App {
    public static void main(String[] args) throws Exception {
        Gato[] gatito = new Gato[4];

        gatito[2] = new Gato(null, null, null);
        gatito[2].setColor("marron");
        gatito[3] = new Gato("Garfield","naranja","macho");
    }
}
