public class App {
    public static void main(String[] args) throws Exception {
        Acceso cuenta = new Acceso();
        System.out.println("#   Codigo de acceso    #");
        cuenta.anadirUsuario("Cueto", "123e");
        cuenta.preguntarUsuario();
    }
}
