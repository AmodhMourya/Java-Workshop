package ConstructorAssingment;

class BankAccountCreation   {
    private String accountType;
    private String customerName;
    private double balance;

    {
        System.out.println("Account Initialization Started");
        this.accountType = "Savings";
    }

    public BankAccountCreation() {
        this("Unknown Customer", 0.0);
    }

    public BankAccountCreation(String customerName) {
        this(customerName, 0.0);
    }

    public BankAccountCreation(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
        System.out.println("Customer: " + this.customerName);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccountCreation account = new BankAccountCreation("Amit Shah", 5000);
    }
}