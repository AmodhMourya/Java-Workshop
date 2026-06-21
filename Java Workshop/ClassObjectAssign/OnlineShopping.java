package ClassObjectAssign;

public class OnlineShopping {
    private String productName;
    private double price;
    private int quantity;

    public OnlineShopping(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getFinalPayableAmount() {
        double totalCost = price * quantity;
        if (totalCost > 5000) {
            totalCost = totalCost - (totalCost * 0.10);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        OnlineShopping cart = new OnlineShopping("Laptop", 1200000.0, 5);
        
        System.out.println("Product Name: " + cart.getProductName());
        System.out.println("Final Payable Amount: Rs" + cart.getFinalPayableAmount());
    }
}
