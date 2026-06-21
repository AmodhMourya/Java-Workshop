package ClassObjectAssign;

public class RideShare {
    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    public RideShare(String customerName, double distanceTravelled, double pricePerKm, double surgeMultiplier) {
        this.customerName = customerName;
        this.distanceTravelled = distanceTravelled;
        this.pricePerKm = pricePerKm;
        this.surgeMultiplier = surgeMultiplier;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public double getFinalFare() {
        double baseFare = distanceTravelled * pricePerKm;
        
        if (distanceTravelled > 20) {
            baseFare = baseFare - (baseFare * 0.10);
        }
        
        double finalFare = baseFare * surgeMultiplier;
        
        if (surgeMultiplier > 1.5) {
            finalFare = finalFare + 50;
        }
        
        return finalFare;
    }

    public static void main(String[] args) {
        RideShare ride = new RideShare("Sarah Cutie(Crush)", 25.0, 12.0, 1.8);

        System.out.println("Customer Name: " + ride.getCustomerName());
        System.out.println("Final Fare: Rs" + ride.getFinalFare());
    }
}