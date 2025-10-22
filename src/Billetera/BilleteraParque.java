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
    public void setTickets(int tickets) {}

    public static boolean isFestivo() {
        return festivo;
    }

    public static void setFestivo(boolean festivo) {
        BilleteraParque.festivo = festivo;
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
