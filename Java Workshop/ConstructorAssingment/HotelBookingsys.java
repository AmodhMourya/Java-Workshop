package ConstructorAssingment;

class HotelBookingsys {
    private String customerName;
    private String roomType;

    {
        System.out.println("Booking Initialized");
        this.roomType = "Deluxe";
    }

    public HotelBookingsys() {
        this("Guest User", "Standard");
    }

    public HotelBookingsys(String customerName) {
        this(customerName, "Deluxe");
    }

    public HotelBookingsys(String customerName, String roomType) {
        this.customerName = customerName;
        this.roomType = roomType;
        System.out.println("Customer: " + this.customerName);
        System.out.println("Room Type: " + this.roomType);
    }

    public static void main(String[] args) {
        HotelBookingsys booking = new HotelBookingsys("Aman", "Deluxe");
    }
}