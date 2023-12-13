public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 15");
        int longitud = (int)(Math.random() * 7 + 1); // la cantidad de cada combo de 4
        int nota = 0; // la nota que va a tocar
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < 4; j++) {
                notas((int)(Math.random() * 7 + 1));
            }
            if (i == longitud - 1) {System.out.print("|");} // si es la ultima longitud imprime una linea mas
            System.out.print("| ");
        }
    }
    public static void notas(int num) {
        switch (num) {
            case 1:
                System.out.print("do ");
                break;
            case 2:
                System.out.print("re ");
                break;
            case 3:
                System.out.print("mi ");
                break;
            case 4:
                System.out.print("fa ");
                break;
            case 5:
                System.out.print("sol ");
                break;
            case 6:
                System.out.print("la ");
                break;
            case 7:
                System.out.print("si ");
                break;
            default:
        }
    }
}
