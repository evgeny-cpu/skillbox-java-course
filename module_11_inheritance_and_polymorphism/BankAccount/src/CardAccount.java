public class CardAccount extends BankAccount {

    @Override
    public boolean take(double count) {
        double sum = count * 1.01;
        return super.take(sum);
    }
}
