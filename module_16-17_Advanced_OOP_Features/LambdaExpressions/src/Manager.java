import java.time.LocalDate;

public class Manager extends Personnel {
    private double percent;

    public Manager(double fixSalary, String name, LocalDate date) {
        super(fixSalary, name, date);
        earnMoneyCompany = 115_000 + ((140_000 - 115_000) * Math.random()); // заработал для компании
        percent = earnMoneyCompany * 0.05;
    }


    @Override
    public double getMonthSalary() {
        return salary + percent;
    }


    @Override
    public String toString() {
        return "\n" + "Менеджер - " + getName() + " зарплата " + String.format("%.2f", salary + percent) +  " * " + "Устроился на работу: " + getDate();
    }
}