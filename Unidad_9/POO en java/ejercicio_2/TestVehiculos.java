package ejercicio_2;

public class TestVehiculos {
    public static void main(String[] args) {
        boolean salida = false;
        Bicicleta miBicicleta = new Bicicleta();
        Coche miCoche = new Coche();
        do {
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
            System.out.print("Elige una opción (1-8):");
            try {
                int opcion = Integer.parseInt(System.console().readLine());
                
                switch (opcion) {
                    case 1:
                        miBicicleta.pedalear();
                        break;
                    case 2:
                        miBicicleta.caballito();
                        break;
                    case 3:
                        miCoche.andarCoche();
                        break;
                    case 4:
                        miCoche.quemarRueda();
                        break;
                    case 5:
                        System.out.println("Kilometros bicicleta: "+miBicicleta.getKilometrosObj());
                        break;
                    case 6:
                        System.out.println("Kilometros coche: "+miCoche.getKilometrosObj());
                        
                        break;
                    case 7:
                        System.out.println("Kilometros totales: "+Vehiculo.getKilometrosTot());
                        break;
                    case 8:
                        System.out.println("¡¡Adios!!");
                        salida = true;
                        break;
                    default:
                        System.out.println("Opcion no permitida");
                }
            } catch (Exception e) {
                System.out.println("Solo se acepta numeros enteros");
            } 
            System.out.println("");   
        } while (salida != true);

    }
}
