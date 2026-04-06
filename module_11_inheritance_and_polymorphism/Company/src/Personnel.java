import java.util.Objects;

public abstract class Personnel implements Employee {
    protected double salary;
    protected double earnMoneyCompany;


    public Personnel(double fixSalary) {
        salary = fixSalary;

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
