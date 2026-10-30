package jobsheet6;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, Customer customer, double balance, double interestRate) {
        super(accountNumber, customer, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void printAccountType() {
        System.out.println("Account type: Savings, interest rate: " + interestRate);
    }
}

