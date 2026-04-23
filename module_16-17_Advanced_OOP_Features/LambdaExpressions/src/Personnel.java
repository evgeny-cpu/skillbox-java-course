import java.time.LocalDate;
import java.util.Objects;

public abstract class Personnel implements Employee {
    protected double salary;
    protected double earnMoneyCompany;
    protected String name;
    protected LocalDate date;

    public Personnel(double fixSalary, String name, LocalDate date) {
        salary = fixSalary;
        this.name = name;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getEarnMoneyCompany() {
        return earnMoneyCompany;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public double getMonthSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return Double.compare(salary, personnel.salary) == 0 && Double.compare(earnMoneyCompany, personnel.earnMoneyCompany) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, earnMoneyCompany);
    }
}