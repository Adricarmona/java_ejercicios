public class App {
    public static void main(String[] args) throws Exception {
        Gato[] gatos = new Gato[4];
        for (int i = 0; i < gatos.length; i++) {
            gatos[i] = new Gato();
            gatos[i].setNombre(System.console().readLine());
        }

        for (int i = 0; i < gatos.length; i++) {
            System.out.println(gatos[i].getNombre());
        }
    }
}
