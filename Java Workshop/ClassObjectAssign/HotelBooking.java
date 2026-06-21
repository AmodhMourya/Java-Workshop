package ClassObjectAssign;

public class HotelBooking {
    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    public HotelBooking(String guestName, double roomPricePerNight, int numberOfNights) {
        this.guestName = guestName;
        this.roomPricePerNight = roomPricePerNight;
        this.numberOfNights = numberOfNights;
    }

    public String getGuestName() {
        return guestName;
    }

    public double getRoomPricePerNight() {
        return roomPricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getFinalAmount() {
        double totalBill = numberOfNights * roomPricePerNight;
        if (numberOfNights >= 7) {
            totalBill = totalBill - (totalBill * 0.15);
        }
        return totalBill;
    }

    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking("Harry Puttar", 15000.0, 8);

        System.out.println("Guest Name: " + booking.getGuestName());
        System.out.println("Room Price Per Night: Rs" + booking.getRoomPricePerNight());
        System.out.println("Number of Nights: " + booking.getNumberOfNights());
        System.out.println("Final Amount: Rs" + booking.getFinalAmount());
    }
}
