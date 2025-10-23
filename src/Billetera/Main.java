package Billetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, tickets, valor;
        BilleteraParque billeteraParque = new BilleteraParque(100);
        Premio camiseta= new Premio("Camiseta", 150);
        Premio sombrero= new Premio("Sombrero", 350);
        Premio tenis= new Premio("Tenis", 600);
        System.out.println("==ADMINISTRADOR DE BILLETERAS PARA PARQUES TEMATICOS===");
        do{
            System.out.println("=====MENU====");
            System.out.println("1. Agregar ticket");
            System.out.println("2. Establecer tickets");
            System.out.println("3. Comprar premio");
            System.out.println("4. Establecer festivo");
            System.out.println("5. Salir");
            switch (opcion=teclado.nextInt()) {
                case 1:
                    System.out.println("¿Cuantos tickets desea agregar?");
                    tickets = teclado.nextInt();
                    billeteraParque.agregarTickets(tickets);
                    System.out.println("Tickets agregados. Ahora cuenta con: "+ billeteraParque.getTickets()+"\n");
                    break;
                case 2:
                    System.out.println("¿Cuantos tickets se debe configurar su billetera?");
                    valor=billeteraParque.setTickets(teclado.nextInt());
                    System.out.println("Su billetera tiene "+ valor+"\n");
                    break;

                case 3:
                    System.out.println("ELIJA ALGUNAS DE ESTAS OPCIONES POR FAVOR: ");
                    System.out.println("1. Camiseta (150 tickets)");
                    System.out.println("2. Sombrero (350 tickets)");
                    System.out.println("3. Tenis (600 tickets)");
                    System.out.println("Ingrese la opcion deseada: ");
                    int res=teclado.nextInt();
                    if(BilleteraParque.getFestivo()){
                        System.out.println("¡PRECIOS DE VACACIONES!");

                    }
                    switch(res){
                        case 1:
                            if(billeteraParque.getTickets()>=camiseta.getPrecioActual()){
                                System.out.println(camiseta.toString()+"\n");

                            } else{
                                System.out.println("No tiene los suficientes tickets para generar la compra");
                            }
                            break;
                        case 2:
                            if(billeteraParque.getTickets()>=sombrero.getPrecioActual()){
                                System.out.println(sombrero.toString()+"\n");

                            } else{
                                System.out.println("No tiene los suficientes tickets para generar la compra");
                            }
                            break;
                        case 3:
                            if(billeteraParque.getTickets()>=tenis.getPrecioActual()){
                                System.out.println(tenis.toString()+"\n");

                            } else{
                                System.out.println("No tiene los suficientes tickets para generar la compra");
                            }
                            break;
                        default:
                            System.out.println("Error. Opcion invalida, intente de nuevo");
                    }
                    break;


                case 4:
                    BilleteraParque.setFestivo();
                    if(BilleteraParque.getFestivo()){
                        System.out.println("Es un dia festivo"+"\n");
                    } else{
                        System.out.println("No es un dia festivo"+"\n");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Por favor escriba un valor valido.");
            }
        } while(opcion!=5);
    }
}