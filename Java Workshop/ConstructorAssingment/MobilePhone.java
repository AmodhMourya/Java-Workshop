package ConstructorAssingment;

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    {
        System.out.println("Inventory Entry Started");
        this.brand = "Samsung";
    }

    public MobilePhone() {
        this("Basic Model", 0.0);
    }

    public MobilePhone(String model) {
        this(model, 0.0);
    }

    public MobilePhone(String model, double price) {
        this.model = model;
        this.price = price;
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("S24", 65000);
    }
}