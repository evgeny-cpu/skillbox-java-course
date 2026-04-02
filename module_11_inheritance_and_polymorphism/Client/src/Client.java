public abstract class Client {
    private double balance = 0;

    public boolean put(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean take(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void print(){
        System.out.println("Баланс: - " + getBalance());
    }
    public abstract void printInfo();

    @Override
    public String toString() {
        return "Client{" +
                "balance=" + balance +
                '}';
    }
}
