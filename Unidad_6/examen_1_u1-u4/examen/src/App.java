import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variables
        Scanner s = new Scanner(System.in); 
        int opcion_1 = 0;
        int opcion_2 = 0; 
        String nombre_producto = " ";
        int cantidad_producto = 0;
        Double precio_por_unidad = 0.0;
        int iva = 0;
        double total_iva = 0;
        double total = 0;
        double total_con_iva = 0;
        double descuento = 0;
        double total_con_descuento = 0;

        // preguntas y la respuesta  
        System.out.println("Introduzca el tipo de producto");
        System.out.println("1.Alimentación");
        System.out.println("2.Electrónica");
        System.out.println("3.Farmacia");
        System.out.println("4.Moda");
        System.out.printf("Opción: ");
        opcion_1 = s.nextInt();

        // el 1 switch
        switch (opcion_1) {
            case 1:
                // Imprimimos todas las opciones nuevamente
                System.out.println("1.Huevos");
                System.out.println("2.Leche");
                System.out.println("3.Pan");
                System.out.println("4.Fruta");
                System.out.println("5.Verdura");
                System.out.println("6.Otros");
                System.out.printf("Opción: ");

                // Hacemos otro scaner y switch dentro de alimentos
                opcion_2 = s.nextInt();
                System.out.printf("Introduzca el nombre del producto: ");
                nombre_producto = s.next();
                System.out.printf("Introduzca la cantidad de productos: ");
                cantidad_producto = s.nextInt();
                System.out.printf("Introduzca el precio por unidad del producto: ");
                precio_por_unidad = s.nextDouble();
                switch (opcion_2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        iva = 4;
                        break;
                    case 6:
                        iva = 10;
                        break;
                    default:
                    System.out.println("Error en la ingesion del numero");
                        break;
                }
                break;
            case 2:
                // Hacemos otro scaner y las preguntas en Electronica
                System.out.printf("Introduzca el nombre del producto: ");
                nombre_producto = s.next();
                System.out.printf("Introduzca la cantidad de productos: ");
                cantidad_producto = s.nextInt();
                System.out.printf("Introduzca el precio por unidad del producto: ");
                precio_por_unidad = s.nextDouble();
                iva = 21;
                break;
            case 3:
                // Hacemos otro scaner y las preguntas en Farmacia
                opcion_2 = s.nextInt();
                System.out.printf("Introduzca el nombre del producto: ");
                nombre_producto = s.next();
                System.out.printf("Introduzca la cantidad de productos: ");
                cantidad_producto = s.nextInt();
                System.out.printf("Introduzca el precio por unidad del producto: ");
                precio_por_unidad = s.nextDouble();
                iva = 4;
                break;
            case 4:
                // Hacemos otro scaner y las preguntas en Moda
                System.out.printf("Introduzca el nombre del producto: ");
                nombre_producto = s.next();
                System.out.printf("Introduzca la cantidad de productos: ");
                cantidad_producto = s.nextInt();
                System.out.printf("Introduzca el precio por unidad del producto: ");
                precio_por_unidad = s.nextDouble();
                iva = 21;
                break;
        
            default:
            System.out.println("Error en la ingesion del numero");
                break;
            }

        // Imprimiento la factura de alimento o farmacia
        if (opcion_1 == 1 || opcion_1 == 3) {
        total = precio_por_unidad * (double)cantidad_producto;
        total_iva = precio_por_unidad * (double)iva / 100;
        total_con_iva = total + total_iva;

        System.out.printf("Factura\n");
        System.out.printf("__________________________________\n");
        System.out.printf("Artículo %25s\n", nombre_producto);
        System.out.printf("Precio                 %.2f€unidad\n", precio_por_unidad);
        System.out.printf("Cantidad %25d€\n", cantidad_producto);
        System.out.printf("Total                        %.2f€\n", total);
        System.out.printf("IVA al %d%%                    %.2f€\n", iva, total_iva);
        System.out.printf("__________________________________\n");
        System.out.printf("Total con IVA                 %.2f€\n", total_con_iva);
        }
        
        // Imprimiento y calculando la factura de electonica
        if (opcion_1 == 2) {
        descuento = precio_por_unidad * 20 / 100;
        total_con_descuento = precio_por_unidad - descuento;

        total = total_con_descuento * (double)cantidad_producto;
        total_iva = total_con_descuento * (double)iva / 100;
        total_con_iva = total + total_iva;

        System.out.printf("Factura\n");
        System.out.printf("__________________________________\n");
        System.out.printf("Artículo %25s\n", nombre_producto);
        System.out.printf("Precio                 %.2f€unidad\n", precio_por_unidad);
        System.out.printf("Cantidad   %23d\n", cantidad_producto);
        System.out.printf("Total                        %.2f€\n", total);
        System.out.printf("descuento (20%%)               %.2f%%\n", descuento);
        System.out.printf("Total con descuento           %.2f€\n", total_con_descuento);
        System.out.printf("IVA al %d%%                    %.2f€\n", iva, total_iva);
        System.out.printf("__________________________________\n");
        System.out.printf("Total con IVA                 %.2f€\n", total_con_iva);
        }

        // imprimiento y calculando la moda
        if (opcion_1 == 4) {
        total = precio_por_unidad * (double)cantidad_producto;
            if (cantidad_producto > 2) {
                descuento = cantidad_producto - (cantidad_producto / 3);
                descuento = precio_por_unidad * (descuento - cantidad_producto);
            }
        total_con_descuento = total + descuento;
        total_iva = total_con_descuento * (double)iva / 100;
        total_con_iva = total_con_descuento + total_iva;

        System.out.printf("Factura\n");
        System.out.printf("__________________________________\n");
        System.out.printf("Artículo %25s\n", nombre_producto);
        System.out.printf("Precio                 %.2f€unidad\n", precio_por_unidad);
        System.out.printf("Cantidad   %23d\n", cantidad_producto);
        System.out.printf("Total                      %.2f€\n", total);
        System.out.printf("descuento (3x2)            %.2f€\n", descuento);
        System.out.printf("Total con descuento        %.2f€\n", total_con_descuento);
        System.out.printf("IVA al %d%%                  %.2f€\n", iva, total_iva);
        System.out.printf("__________________________________\n");
        System.out.printf("Total con IVA              %.2f€\n", total_con_iva);
        }
    }
}
