package ClassObjectAssign;

public class BankWithdrawlStory {
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    public BankWithdrawlStory(String accountHolder, double balance, double withdrawAmount) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void processWithdrawal() {
        if (getWithdrawAmount() <= getBalance()) {
            balance = balance - getWithdrawAmount();
            System.out.println("Remaining Balance: Rs" + getBalance());
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Current Balance: Rs" + getBalance());
        }
    }

    public static void main(String[] args) {
        BankWithdrawlStory account = new BankWithdrawlStory("Tipendra lal Gada", 100000.0, 87655.0);
        System.out.println("Account Holder: " + account.getAccountHolder());
        account.processWithdrawal();
    }
}
