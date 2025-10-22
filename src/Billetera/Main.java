package Billetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, tickets;
        BilleteraParque billeteraParque = new BilleteraParque(100);
        for(int i=0;i<100;i++){
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
                    System.out.println("Tickets agregado. Ahora cuenta con: "+ billeteraParque.getTickets());
                    break;
                case 2:
                    System.out.println("¿Cuantos tickets se debe configurar su billetera?");//nosabo luego checo
                    break;

                case 3:
                    System.out.println("¡PRECIOS DE VACACIONES, APROVECHA YA!");
                    System.out.println("1. Camiseta (75 tickets)");
                    System.out.println("2. Sombrero (175 tickets)");
                    System.out.println("3. Tenis (300 tickets)");
                    break;
                default:
                    System.out.println("Por favor escriba un valor valido.");
            }
        }
    }
}