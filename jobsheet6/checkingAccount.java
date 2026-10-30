package jobsheet6;

public class checkingAccount extends Account {
    private double overdraftlimit;

    public checkingAccount(String    accountNumber, Customer customer, double balance, double overdraftlimit) {
        super(accountNumber, customer, balance);
        this.overdraftlimit = overdraftlimit;
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void printAccountType() {
        System.out.println("Account type: Checking, overdraft limit: " + overdraftlimit);
    }
} 

