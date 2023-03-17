import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        int tipo,cantidad;
        String fila;
        Seccion sec[]={new Seccion("VIP"), new Seccion("Palcos"),new Seccion("Normal")};
        do {
            System.out.print( "=== Menú ===\n" +
                    "1. Dar de alta Fila\n" +
                    "2. Dar de alta asiento\n" +
                    "3. Mostrar filas de una sección\n" +
                    "4. Listar asientos disponibles\n" +
                    "5. Asignar precio de boletos\n" +
                    "6. Venta de boletos\n" +
                    "7. Cancelar una venta\n" +
                    "8. Cambiar asiento\n" +
                    "9. Mostrar ventas por sección\n" +
                    "10. Salir\n");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1 seleccionada: Dar de alta Fila");
                    System.out.println("Introduzca donde desea insertar la fila: ");
                    System.out.println("1.Vip" +
                            "\n2.Palcos" +
                            "\n3.Normal");
                    tipo=sc.nextInt()-1;
                    System.out.println("Introduzca el numero de filas que desea insertar");
                    cantidad=sc.nextInt();
                    sec[tipo].opS.insertarFila(cantidad);

                    //
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada: Dar de alta asiento");
                    System.out.println("Introduzca donde desea insertar los asientos: ");
                    System.out.println("1.Vip" +
                            "\n2.Palcos" +
                            "\n3.Normal");
                    tipo=sc.nextInt()-1;
                    System.out.println("Introduzca la fila en la que desea insertar el asiento: ");
                    fila=sc.next();
                    char ch =(char)fila.charAt(0);
                    System.out.println("Introduzca la cantidad de asientos que desea insertar: ");
                    cantidad=sc.nextInt();
                    sec[tipo].opS.InsertarAsientos(ch, cantidad);

                    //
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada: Mostrar filas de una sección");
                    System.out.println("Introduzca la seccion la que desea ver la lista: ");
                    System.out.println("1.Vip" +
                            "\n2.Palcos" +
                            "\n3.Normal");
                            tipo=sc.nextInt()-1;
                            sec[tipo].opS.mostrarFilaYAsientos();
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada: Listar asientos disponibles");
                    System.out.println("Introduzca la seccion la que desea ver la lista: ");
                    System.out.println("1.Vip" +
                            "\n2.Palcos" +
                            "\n3.Normal");
                            tipo=sc.nextInt()-1;
                            sec[tipo].opS.ListarAsientos();

                    break;
                case 5:
                    System.out.println("Opción 5 seleccionada: Asignar precio de boletos");
                    System.out.println("Introduzca la seccion la que desea ver la lista: ");
                    System.out.println("1.Vip" +
                            "\n2.Palcos" +
                            "\n3.Normal");
                    tipo=sc.nextInt()-1;
                    System.out.println("Introduzca el precio de la seccion: ");
                    int precio=sc.nextInt();
                    sec[tipo].setPrecio(precio);
                    break;
                case 6:
                    double TotalApagar=0;
                    System.out.println("Opción 6 seleccionada: Asignar precio de boletos");
                    int contador=0;
                    System.out.println("Introduzca la cantidad de los boletos a comprar");
                    cantidad=sc.nextInt();
                    if (cantidad<=(sec[0].opS.ContarFilaA()) + (sec[1].opS.ContarFilaA()) + (sec[2].opS.ContarFilaA())){
                        do{
                            System.out.println("Introduzca la seccion la que desea ver la lista: ");
                            System.out.println("1.Vip" + "\n2.Palcos" + "\n3.Normal");
                            tipo=sc.nextInt()-1;
                            if (sec[tipo].opS.ContarFilaA()>=1) {
                                System.out.println("Asientos Disponibles en la seccion");
                                sec[tipo].opS.ListarAsientos();
                                System.out.println("Introduzca la fila en la que desea comprar el boleto: ");
                                fila=sc.next();
                                char Pre =(char)fila.charAt(0);
                                if (sec[tipo].opS.PosFila(Pre)){
                                    System.out.println("Introduzca el asiento que desea de la fila");
                                    int numeroA=sc.nextInt();
                                    System.out.println((sec[tipo].opS.Llamar(sec[tipo].opS.EnviarFila(Pre),numeroA)));
                                    if (!sec[tipo].opS.Llamar(sec[tipo].opS.EnviarFila(Pre),numeroA)){
                                        sec[tipo].opS.llamarVender(sec[tipo].opS.EnviarFila(Pre),numeroA);
                                        contador++;
                                        TotalApagar += sec[tipo].getPrecio();
                                    }
                                }
                            }
                        }while (contador<=cantidad);
                                System.out.println("El importe total es " + TotalApagar);
                    }

                    break;
                case 7:
                    System.out.println("Opción 7 seleccionada: Cancelar una venta");
                    // código para cancelar una venta
                    break;
                case 8:
                    System.out.println("Opción 8 seleccionada: Cambiar asiento");
                    // código para cambiar un asiento
                    break;
                case 9:
                    System.out.println("Opción 9 seleccionada: Mostrar ventas por sección");
                    // código para mostrar las ventas por sección
                    break;
                case 10:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida. Por favor ingrese una opción del 1 al 10.");
                    break;
            }
        } while (opcion != 10);
    }
}
