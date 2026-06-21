package ClassObjectAssign;

public class ElectricityBillSys {
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    public ElectricityBillSys(String customerName, int unitsConsumed, double pricePerUnit) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.pricePerUnit = pricePerUnit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalBill() {
        double totalBill = unitsConsumed * pricePerUnit;
        if (unitsConsumed > 500) {
            totalBill = totalBill + (totalBill * 0.10);
        }
        return totalBill;
    }

    public void displayBill() {
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Units Consumed: " + getUnitsConsumed());
        System.out.println("Price Per Unit: Rs" + getPricePerUnit());
        System.out.println("Total Bill (including surcharge if applicable): Rs" + getTotalBill());
    }

    public static void main(String[] args) {
        ElectricityBillSys bill = new ElectricityBillSys("Mahendra Babu", 550, 0.20);
        bill.displayBill();
    }
}