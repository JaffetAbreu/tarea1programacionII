import java.util.Scanner;

public class tarea_de_tienda_alfonso {

        public static void main(String[] args) {
            String[] productos = {"iPhone 14", "Samsung Galaxy S23", "Xiaomi Redmi Note 13", "Motorola Edge 40", "OnePlus 11"};
            double[] precios = {19999.99, 13949.50, 10299.99, 8399.99, 6599.99};

            int[] carrito = new int[10];
            int contadorCarrito = 0;

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {    
                System.out.println("\n--- TIENDA DE CELULARES ---");
                System.out.println("1. Ver productos");
                System.out.println("2. Agregar producto al carrito");
                System.out.println("3. Ver total a pagar");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
// Agregado menú interactivo - commit 2

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- LISTA DE PRODUCTOS ---");
                        for (int i = 0; i < productos.length; i++) {
                            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
                        }
                        break;

                    case 2:
// Agregada lógica de compra - commit 3

                        System.out.println("\nIngrese el número del producto que desea agregar al carrito:");
                        for (int i = 0; i < productos.length; i++) {
                            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
                        }
                        int seleccion = scanner.nextInt();
                        if (seleccion >= 1 && seleccion <= productos.length) {
                            if (contadorCarrito < carrito.length) {
                                carrito[contadorCarrito] = seleccion - 1;
                                contadorCarrito++;
                                System.out.println(productos[seleccion - 1] + " agregado al carrito.");
                            } else {
                                System.out.println("El carrito está lleno.");
                            }
                        } else {
                            System.out.println("Selección inválida.");
                        }
                        break;

                    case 3:
                        double total = 0;
                        System.out.println("\n--- CARRITO DE COMPRAS ---");
                        for (int i = 0; i < contadorCarrito; i++) {
                            int index = carrito[i];
                            System.out.println("- " + productos[index] + ": $" + precios[index]);
                            total += precios[index];
                        }
                        System.out.println("Total a pagar: $" + total);
                        break;

                    case 4:
                        System.out.println("Gracias por visitar la Tienda de Celulares.");
                        break;

                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }

            } while (opcion != 4);

            scanner.close();
        }
    }


