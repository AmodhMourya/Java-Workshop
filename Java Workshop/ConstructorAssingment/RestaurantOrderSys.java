package ConstructorAssingment;

class RestaurantOrderSys {
    private String foodItem;
    private int quantity;

    {
        System.out.println("New Order Started");
    }

    public RestaurantOrderSys() {
        this("Basic Order", 1);
    }

    public RestaurantOrderSys(String foodItem) {
        this(foodItem, 1);
    }

    public RestaurantOrderSys   (String foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        System.out.println("Item: " + this.foodItem);
        System.out.println("Quantity: " + this.quantity);
    }

    public static void main(String[] args) {
        RestaurantOrderSys order = new RestaurantOrderSys("Pizza", 2);
    }
}