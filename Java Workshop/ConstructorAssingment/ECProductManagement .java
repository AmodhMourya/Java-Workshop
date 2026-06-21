package ConstructorAssingment;
class ECProductManagement {
    private String productName;
    private double price;
    private String category;

    {
        System.out.println("Product Management System Initialized");
        this.category = "Electronics";
    }

    public ECProductManagement() {
        this.productName = "Generic Product";
        this.price = 0.0;
        display();
    }

    public ECProductManagement(String productName) {
        this();
        this.productName = productName;
        display();
    }

    public ECProductManagement(String productName, double price) {
        this(productName);
        this.price = price;
        display();
    }

    public ECProductManagement(String productName, double price, String category) {
        this(productName, price);
        this.category = category;
        display();
    }

    public void display() {
        System.out.println("--- Product Info ---");
        System.out.println("Category: " + this.category);
        System.out.println("Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println();
    }

    public static void main(String[] args) {
        ECProductManagement product = new ECProductManagement("Smartphone", 29999.0, "Gadgets");
    }
}