package Billetera;

public class BilleteraParque {
    private int tickets;
    static boolean festivo=false;

    //constructores
    public BilleteraParque() {}
    public BilleteraParque(int tickets){
        this.tickets=tickets;
    }

    public int getTickets() {
        return tickets;
    }
    public int setTickets(int tickets) {
        if(tickets>=0){
            this.tickets=tickets;
        }
        return tickets;
    }

    public static boolean getFestivo() {

        return festivo;
    }


    public static void setFestivo() {
        festivo= !festivo;
    }

    //metodos
    public void agregarTickets(int tickets){
        if(tickets>0){
            this.tickets+=tickets;
        } else{}

    }
    public boolean removerTickets(int tickets){
        if(tickets>0){
            this.tickets-=tickets;
            return true;
        } else{
            return false;
        }
    }

}
