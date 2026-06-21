package ConstructorAssingment;
class LaptopPurchaseSys {
    private String warranty;
    private String model;
    private double price;

    {
        System.out.println("Purchase Initialized");
        this.warranty = "1 Year";
    }

    public LaptopPurchaseSys() {
        this("Basic Model", 0.0);
    }

    public LaptopPurchaseSys(String model) {
        this(model, 0.0);
    }

    public LaptopPurchaseSys(String model, double price) {
        this.model = model;
        this.price = price;
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Warranty: " + this.warranty);
    }

    public static void main(String[] args) {
        LaptopPurchaseSys laptop = new LaptopPurchaseSys("Dell", 55000);
    }
}