package ejercicio_2;

public class TestVehiculos {
    public static void main(String[] args) {
        System.out.println("VEHICULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Elige una opción (1-8):");
        try {
            int opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    Bicicleta mBicicleta = new Bicicleta();
                    mBicicleta.pedalear();
                    break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
                case 5:

                break;
                case 6:

                break;
                case 7:

                break;
                case 8:
                    System.out.println("¡¡Adios!!");
                break;
                default:
                    System.out.println("Opcion no permitida");
                    main(args);
            }
        } catch (Exception e) {
            System.out.println("Solo se acepta numeros enteros");
            main(args);
        }
    }
}
