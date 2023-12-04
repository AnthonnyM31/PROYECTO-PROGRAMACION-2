package PROYECTO;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CineMAIN {

    public static void main(String[] args) {
        Sala sala1 = new Sala();        sala1.setNumero_sala("***SALA NUMERO 1***");
        Sala sala2 = new Sala();        sala2.setNumero_sala("***SALA NUMERO 2***");
        Sala sala3 = new Sala();        sala3.setNumero_sala("***SALA NUMERO 3***");
        Sala sala4 = new Sala();        sala4.setNumero_sala("***SALA NUMERO 4***");
        Sala sala5 = new Sala();        sala5.setNumero_sala("***SALA NUMERO 5***");
        Sala[] salas = {sala1,sala2,sala3,sala4,sala5};


       Inventario snack1 = new Inventario("CHOCOLATES",40, 4.99);
        Inventario snack2 = new Inventario("NACHOS", 50, 3.99);
        Inventario snack3 = new Inventario("CHICLES", 80, 2.99);


        Estadisticas gastos = new Estadisticas(2, 1.5, 1, 0, 0, 0, 0,0,0);


        int op=0;
Scanner sc = new Scanner(System.in) ;

       do {

           System.out.println("1.- ingresar pelicula");
           System.out.println("2.- modificar pelicula");
           System.out.println("3.- eliminar pelicula");
           System.out.println("4.- inventario");
           System.out.println("5.- vender entradas");
           System.out.println("6.- visualizar ventas"); //aqui deberia aparecer cuanto haz vendido hoy y cuanto haz gastado en reabastecer los insumos del inventario
           System.out.println("7.- ver salas");
           op = Integer.parseInt(sc.next());

           switch (op) {

               case 1:
                   System.out.println("salas existentes: ");
                   for (int i = 0; i < salas.length; i++) {
                       Sala salas_disponibles = salas[i];
                       {
                           if (!salas_disponibles.Vacio()) {
                               System.out.print(salas_disponibles.getNumero_sala());
                               System.out.println(" CON DATOS");
                           }else{
                               System.out.println("."+salas_disponibles.getNumero_sala()+" SIN DATOS");
                           }
                       }

                   }
                   System.out.println("En que sala desea ingresar la pelicula (ingresar unicamente numero de sala)");
                   int sala_eleccion1 = sc.nextInt();
                   Sala salaSeleccionada1 = salas[sala_eleccion1 - 1];
                   System.out.println(salaSeleccionada1.verificarDatos());
                   int opc;

                   System.out.println("desea continuar?");
                   System.out.println("1.- si");
                   System.out.println("2.- no");
                   opc = Integer.parseInt(sc.next());
                   switch(opc){

                       case 1:
                   if (sala_eleccion1 > 0 && sala_eleccion1 < 6) {


                       System.out.println("ingrese su duracion: (en minutos)");
                        int peliculaDuracion = sc.nextInt();
                        salaSeleccionada1.setDuracion_pelicula(peliculaDuracion);

                       System.out.println("");
                       String a = sc.nextLine();


                           System.out.println("ingrese su sinopsis: ");
                          String peliculaSinopsis = sc.nextLine();
                           salaSeleccionada1.setSinopsis_pelicula(peliculaSinopsis);

                           System.out.println("ingrese su horario: ");
                       System.out.println("ejemplo: 15:00 - 18:00");
                           String peliculaHorario = sc.nextLine();
                          salaSeleccionada1.setHorario_pelicula(peliculaHorario);

                       System.out.println("ingrese su pelicula: ");
                       String peliculaNombre;
                       peliculaNombre = sc.nextLine();
                       salaSeleccionada1.setNombre_pelicula(peliculaNombre);

                           System.out.println("PELICULA REGISTRADA EXITOSAMENTE");
                   }else{
                       System.out.println("por favor ingrese el valor de una sala existente");
                   }
                   break;

                       default:
                           System.out.println("de vuelta al menu principal");
                           break;
                   }
break;
               case 2:
                   System.out.println("en que sala desea modificar la pelicula? (NO PUEDE MODIFICAR UNA SALA SIN DATOS)");
                   System.out.println("salas existentes: ");

                   for (int i = 0; i < salas.length; i++) {
                       Sala salas_disponibles = salas[i];
                       {
                           if (!salas_disponibles.Vacio()) {
                               System.out.print(salas_disponibles.getNumero_sala());
                               System.out.println(" CON DATOS");
                           }else{
                               System.out.println("."+salas_disponibles.getNumero_sala()+" SIN DATOS");
                           }
                       }

                   }

                   int sala_eleccion2 = sc.nextInt();

                   Sala salaSeleccionada2 = salas[sala_eleccion2 - 1];
                   if (sala_eleccion2 >= 1 && sala_eleccion2 <= 5) {

                       if (salaSeleccionada2.Vacio()) {
                           salaSeleccionada2.MensajePrueba();
                       }else {
                           System.out.println("");
                           String a = sc.nextLine();

                           System.out.println("que nueva pelicula desea ingresar: ");
                           String peliculaNombre = sc.nextLine();
                           salaSeleccionada2.setNombre_pelicula(peliculaNombre);

                           System.out.println("ingrese su nueva duracion: (en minutos)");
                           int peliculaDuracion = sc.nextInt();
                           salaSeleccionada2.setDuracion_pelicula(peliculaDuracion);

                           System.out.println("");
                           String b = sc.nextLine();

                           System.out.println("ingrese su nueva sinopsis: ");
                           String peliculaDescripcion = sc.nextLine();
                           salaSeleccionada2.setSinopsis_pelicula(peliculaDescripcion);

                           System.out.println("ingrese su nuevo horario: ");
                           String peliculaHorario = sc.nextLine();
                           salaSeleccionada2.setHorario_pelicula(peliculaHorario);

                           System.out.println("PELICULA MODIFICADA EXITOSAMENTE");
                       }
                   } else{
                       System.out.println("por favor ingrese una sala que exista");
                   }
                   break;

               case 3:
                   System.out.println("ingrese la sala la cual desea eliminar sus datos: ");
                   System.out.println("salas existentes: ");
                   for (int i = 0; i < salas.length; i++) {
                       Sala salas_disponibles = salas[i];
                       {
                           if (!salas_disponibles.Vacio()) {
                               System.out.print(salas_disponibles.getNumero_sala());
                               System.out.println(" CON DATOS");
                           }else{
                               System.out.println("."+salas_disponibles.getNumero_sala()+" SIN DATOS");
                           }
                       }

                   }
                   int eliminar_sala = sc.nextInt();

                   Sala eliminarSala = salas[eliminar_sala - 1];
                   if(eliminar_sala > 0 && eliminar_sala < 6){

                   if (eliminarSala.Vacio()) {
                       System.out.println("no existen datos que eliminar");
                   } else {
                       //aqui otro metodo, supongo que deberias deejar en blanco todos los atributos del objeto que se haya selecionado
                       eliminarSala.eliminarDatos();
                       System.out.println("PELICULA ELIMINADA EXITOSAMENTE");
                   }
                   }else{
                       System.out.println("por favor ingrese una sala que exista");
                   }
                   break;


               case 4:
                   System.out.println("los datos del inventario son: ");
                   System.out.println(snack1.toString());
                   System.out.println(snack2.toString());
                   System.out.println(snack3.toString());


                   System.out.println("¿Que accion desea realizar?");
                   int opcion = 0;

                   System.out.println("1.- aumentar existencias");
                   System.out.println("2.- vender existencias");
                   System.out.println("3.- salir");

                   opcion = Integer.parseInt(sc.next());
                   switch (opcion) {

                       case 1:
                           System.out.println("las existencias de que snack desea aumentar?");
                           System.out.println("1.- CHOCOLATES");
                           System.out.println("2.- NACHOS");
                           System.out.println("3.- CHICLES");
                           int opcion1=0;
                           opcion1 = Integer.parseInt(sc.next());
                           switch (opcion1){

                               case 1:
                                   System.out.println("cuantas existencias desea agregar?");

                                   System.out.println("cada existencia extra tiene un valor de $"+gastos.getReabastecimientoSnack1()+" dolares");
                                   int masCantidad1 = sc.nextInt();

                                   gastos.setGastosSnack1(gastos.getReabastecimientoSnack1() * masCantidad1);

                                   snack1.setCantidad(snack1.getCantidad() + masCantidad1);

                                   System.out.println("CANTIDAD AUMENTADA");
                                   break;

                               case 2:
                                   System.out.println("cuantas existencias desea agregar?");

                                   System.out.println("cada existencia extra tiene un valor de $"+gastos.getReabastecimientoSnack2()+" dolares");
                                   int masCantidad2 = sc.nextInt();

                                   gastos.setGastosSnack2(gastos.getReabastecimientoSnack2() * masCantidad2);

                                   snack2.setCantidad(snack2.getCantidad() + masCantidad2);

                                   System.out.println("CANTIDAD AUMENTADA");
                                   break;

                               case 3:
                                   System.out.println("cuantas existencias desea agregar?");

                                   System.out.println("cada existencia extra tiene un valor de $"+gastos.getReabastecimientoSnack3()+" dolares");
                                   int masCantidad3 = sc.nextInt();

                                   gastos.setGastosSnack3(gastos.getReabastecimientoSnack3() * masCantidad3);

                                   snack3.setCantidad(snack3.getCantidad() + masCantidad3);

                                   System.out.println("CANTIDAD AUMENTADA");

                                   break;
                               default:
                                   System.out.println("por favor escoja una de las opciones permitidas (1,2,3)");
                                   System.out.println();
                                   break;
                           }
                            break;

                       case 2:
                           System.out.println("que existencias desea vender?");
                           System.out.println("1.- CHOCOLATES");
                           System.out.println("2.- NACHOS");
                           System.out.println("3.- CHICLES");
                           int opcion2=0;
                           opcion2 = Integer.parseInt(sc.next());
                           switch (opcion2){

                               case 1:
                                   System.out.println("costo "+snack1.getnombreSnack()+ "  $" +snack1.getPrecio());
                                   System.out.println("cuantas existencias desea vender?");
                                   int venta1 = sc.nextInt();

                                   snack1.setCantidad(snack1.getCantidad()-venta1);
                                   gastos.setGananciasSnack1(venta1 * snack1.getPrecio());


                                   System.out.println("CANTIDAD VENDIDA");
                                   break;

                               case 2:
                                   System.out.println("costo "+snack2.getnombreSnack()+ "  $" +snack2.getPrecio());
                                   System.out.println("cuantas existencias desea vender?");
                                   int venta2 = sc.nextInt();

                                   snack2.setCantidad(snack2.getCantidad()-venta2);
                                   gastos.setGananciasSnack2(venta2 * snack2.getPrecio());


                                   System.out.println("CANTIDAD VENDIDA");
                                   break;

                               case 3:
                                   System.out.println("costo "+snack3.getnombreSnack()+ "  $" +snack3.getPrecio());
                                   System.out.println("cuantas existencias desea vender?");
                                   int venta3 = sc.nextInt();

                                   snack3.setCantidad(snack3.getCantidad()-venta3);
                                   gastos.setGananciasSnack3(venta3 * snack3.getPrecio());


                                   System.out.println("CANTIDAD VENDIDA");
                                   break;

                               default:
                                   System.out.println("por favor escoja una opcion disponible (1,2,3)");
                                   System.out.println();
                                   break;
                           }
                           break;


                       case 3:
                           System.out.println("volviendo al menu principal...");
                           System.out.println();
                           break;
                       default:
                           System.out.println("opcion no valida");
                           break;
                   }
                   break;


               case 5:

                   System.out.println("cuantas entradas necesita?");
                   //otro metodo
                   System.out.println("para que pelicula?");
                   System.out.println("peliculas disponibles: ");
                   //se imprimiran todas las salas

                   //otro metodo
                   System.out.println("elija sus asientos");
                   System.out.println("asientos disponibles: ");
                   //la parte mas cagada

                   System.out.println("----FACTURA---");
                   //se imprimirán todos los datos
                   break;

               case 6:
                   break;

               case 7:
                   System.out.println("Las salas existentes son: ");
                   for (int i = 0; i < salas.length; i++) {
                       Sala salas_disponibles = salas[i];
                       {
                           System.out.println(salas_disponibles.toString());
                       }

                   }

                   break;
               default:

           }

        }while(op!= 8);

    }

     }









