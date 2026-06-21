package ConstructorAssingment;

class MovieTicketBook {
    private String movieName;
    private String seatNumber;

    {
        System.out.println("Booking Started");
    }

    public MovieTicketBook() {
        this("Regular Movie", "General");
    }

    public MovieTicketBook(String movieName) {
        this(movieName, "Not Assigned");
    }

    public MovieTicketBook(String movieName, String seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        System.out.println("Movie: " + this.movieName);
        System.out.println("Seat No: " + this.seatNumber);
    }

    public static void main(String[] args) {
        MovieTicketBook ticket = new MovieTicketBook("Avenger Welcome To FiFA", "F12");
    }
}