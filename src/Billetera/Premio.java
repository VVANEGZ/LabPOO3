package Billetera;

public class Premio {
    private String premio;
    private int tickets;

    public Premio(String premio, int tickets) {
        this.premio = premio;
        this.tickets = tickets;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Acaba de comprar: " + premio +
                " por " + getPrecioActual();
    }
    public int getPrecioActual(){
       if(BilleteraParque.getFestivo()){
           return tickets/2;
       }
        return tickets;
    }

}
