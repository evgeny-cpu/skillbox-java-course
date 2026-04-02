import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;


    @Override
    public boolean put(double count) {
        super.put(count);
        if (count > 0) {
            lastIncome = LocalDate.now();
            return true;
        }
        return false;
    }

    @Override
    public boolean take(double count) {
        if (lastIncome != null && LocalDate.now().isBefore(lastIncome.plusMonths(1))) {
            return false;
        }
        return super.take(count);
    }
}
