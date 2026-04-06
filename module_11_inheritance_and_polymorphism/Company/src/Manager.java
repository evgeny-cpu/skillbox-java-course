public class Manager extends Personnel {
    private double percent;

    public Manager(double fixSalary) {
        super(fixSalary);
        earnMoneyCompany = 115_000 + ((140_000 - 115_000) * Math.random()); // заработал для компании
        percent  = earnMoneyCompany * 0.05;
    }


    @Override
    public double getMonthSalary() {
        return salary + percent;
    }



    @Override
    public String toString() {
        return "\n" + "Manager = Зарплата " + String.format("%.2f",salary + percent);
    }
}
