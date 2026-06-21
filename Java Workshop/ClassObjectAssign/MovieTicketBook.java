package ClassObjectAssign;

public class MovieTicketBook {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTicketBook(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTotalCost() {
        double totalCost = numberOfTickets * ticketPrice;
        if (numberOfTickets >= 5) {
            totalCost = totalCost - (totalCost * 0.05);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        MovieTicketBook ticket = new MovieTicketBook("Spider-Man Go To Bihar", 120.0, 6);
        MovieTicketBook ticket1 = new MovieTicketBook("Jethalal Vs Bhide", 150.0, 8);
        System.out.println("Movie Name: " + ticket.getMovieName());
        System.out.println("Total Price: Rs" + ticket.getTotalCost());
        System.out.println("Movie Name: " + ticket1.getMovieName());
        System.out.println("Total Price: Rs" + ticket1.getTotalCost());
    }
}

