import java.time.LocalDate;

public class TopManager extends Personnel {
    private Company company;

    public TopManager(double fixSalary,String name, LocalDate date, Company company) {
        super(fixSalary,name,date);
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return company.getIncome() > 10_000_000 ? salary * 2.5 : salary;
    }


    public String toString() {
        return "\n" + "Топ менеджер - " + getName() + " зарплата " + getMonthSalary() +  " * " + "Устроился на работу: " + getDate();
    }
}