public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0; 
        
        System.out.print("Introduce el numero que quieras la tabla de multiplicar\n -->");
        num = Integer.parseInt(System.console().readLine());
        System.out.println("Tabla de multiplicar del "+num);
        System.out.println("-----------");
        for (int i = 0; i < 11; i++) {
            System.out.println(num+" * "+i+" = "+(i*num));
        }
        System.out.println("-----------");
    }
}
