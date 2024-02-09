public class Menu {
    public static void main(String[] args) {
        int opcion = 0;
        Zona principal = new Zona(1000); // entras principales
        Zona compraVenta = new Zona(200); // entradas compra venta
        Zona vip = new Zona(25); // entradas de la zona vip
        System.out.println("\n#######################################");
        System.out.println("#    Programa de compra de entradas   #");
        System.out.println("#######################################");
        do {
            // mostramos el menu y preguntamos la opcion 
            try {
                do {
                    System.out.print("1. Mostrar número de entradas libres\n2. Vender entradas\n3. Salir\n-> ");
                    opcion = Integer.parseInt(System.console().readLine());
                    if (opcion < 1 || opcion > 3) {System.out.println("Parametro invalido.");}
                } while (opcion < 0 && opcion > 4);    
            } catch (Exception e) {
                System.out.println("Se esperaba un numero entero.");
            }
            opciones(opcion, principal, compraVenta, vip);
        } while (opcion != 3);
    }

    /**
     * La opciones del 1º menu donde seleccionas entradas disponibles, para venderlas y salir
     * @param opcion: La opcion seleccionada
     * @param principal: Las entradas principal
     * @param compraVenta: Las entradas compraVenta
     * @param vip: Las entradas vip
     */
    public static void opciones(int opcion, Zona principal, Zona compraVenta, Zona vip){
        // elegimos la opcion y hacemos lo que pida
        switch (opcion) {
            case 1:
                System.out.println("\n##############################################");
                System.out.println("# Entradas disponibles zona principal: "+principal.getEntradasPorVender());
                System.out.println("# Entradas disponibles zona compra-venta: "+compraVenta.getEntradasPorVender());
                System.out.println("# Entradas disponibles zona vip: "+vip.getEntradasPorVender());
                break;
            case 2:
                opcionesDos(principal, compraVenta, vip);
                break;
            case 3:
                System.out.println("\n#####################");
                System.err.println("# ¡¡¡Hasta luego!!! #");
                System.out.println("#####################");
                break;
            default:
        }
        System.out.println();// salto de linea
    }


    /**
     * La 2 opcion de las entradas ya para comprarlas
     * @param principal: El objeto de las entradas principales
     * @param compraVenta: El objeto de las entradas compraventa
     * @param vip: El objeto de las entradas vip
     */
    public static void opcionesDos(Zona principal, Zona compraVenta, Zona vip){
        System.out.println("##########################\n#  Entradas disponibles  #\n##########################\n"+
                        "1.-Princial: "+principal.getEntradasPorVender()+"\n"+
                        "2.-Compra venta: "+compraVenta.getEntradasPorVender()+"\n"+
                        "3.-Vip: "+vip.getEntradasPorVender()+"\n");
        int opcion = 0;
        try {
            do {
                System.out.print("--------------------\nDonde quieres comprarla: ");
                opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        principal.vender(cantidad());
                        break;
                    case 2:
                        compraVenta.vender(cantidad());
                        break;
                    case 3:
                        vip.vender(cantidad());
                    default:
                }
                if (3 < opcion || 1 > opcion) {System.out.println("Parametro invalido.");}
            } while(4 < opcion && 0 > opcion);
        } catch (Exception e) {
            System.out.println("Se espereaba un numero entero.");
        }
        System.out.println();
    }

    /**
     * @return: la cantidad de entradas que quiera el usuario
     */
    public static int cantidad(){
        System.out.print("¿Cuanta entradas quiere?: ");
        return Integer.parseInt(System.console().readLine());
    }
}
