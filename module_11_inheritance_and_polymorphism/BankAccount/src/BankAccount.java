public class BankAccount {
    private double balance = 0;


    public boolean put(double count) {
        if (count > 0) {
            balance += count;
            return true;
        }
        return false;
    }

    public boolean take(double count) {
        if (count <= balance) {
            balance -= count;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
