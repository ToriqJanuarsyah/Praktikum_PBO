package jobsheet6;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        SavingAccount  acc1 = new SavingAccount("A001", customer1, 500000, 0.01);
        acc1.withdraw(150000);
        
        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        checkingAccount acc2 = new checkingAccount("A002", customer2, 200000, 500000);
        acc2.withdraw(230000);

        Customer customer3 = new Customer("Budi", "0812-0000-0003");
        BusinessAccount acc3 = new BusinessAccount("A003", customer3, 1000000, 25000);
      
    Bank bank = new Bank(10);
    bank.addAccount(acc1);
    bank.addAccount(acc2);
    bank.addAccount(acc3);

    bank.printAllAccounts();
    acc1.printAccountType();
    acc2.printAccountType();
    acc3.printAccountType();
    }
}   
