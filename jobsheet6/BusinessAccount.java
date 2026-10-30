package jobsheet6;

public class BusinessAccount extends Account {
    private double monthlyTranscationFee;

    public BusinessAccount(String accountNumber, Customer owner, double balance, double monthlyTranscationFee) {
        super(accountNumber, owner, balance);
        this.monthlyTranscationFee = monthlyTranscationFee;
    }

    public double getMonthlyTranscationFee() {
        return monthlyTranscationFee;
    }

    public void printAccountType() {
        System.out.println("Account type: Business, monthly transaction fee: " + monthlyTranscationFee);
    }
}
