package jobsheet10;

public class Bank {
    private Account[] accounts;
    private int count;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        count = 0;
    }

    public boolean addAccount(Account account) {
        if (count >= accounts.length) {
            return false;
        }
        accounts[count] = account;
        count++;
        return true;
    }

    // update Method findAccount to throw AccountNotFoundException
    public Account findAccount(String accountNumber) throws AccountNotFoundException {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        // Jika looping selesai dan tidak ketemu, lempar exception
        throw new AccountNotFoundException("Account " + accountNumber + " not found in the bank.");
    }

    public void printAllAccounts() {
        for (int i = 0; i < count; i++) {
            accounts[i].printInfo();
        }
    }

    public void printMonthlyFees() {
        for ( int i = 0; i < count; i++) {
            System.out.println(accounts[i].getAccountNumber() + " fee: " + accounts[i].monthlyFee());
        }
    }

    public void processMonthEnd() {
        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + "interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    public void printAuditLog() {
        System.out.println("--- Audit Log Report ---");
        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            
            // Memeriksa apakah rekening memiliki kemampuan Auditable
            if (acc instanceof Auditable auditableAcc) {
                System.out.println(auditableAcc.auditLog());
            }
        }
    }    
}
