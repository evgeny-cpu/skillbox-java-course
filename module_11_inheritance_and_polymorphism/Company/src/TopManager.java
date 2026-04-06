public class TopManager extends Personnel {
    private Company company;

    public TopManager(double fixSalary, Company company) {
        super(fixSalary);
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return company.getIncome() > 10_000_000 ? salary * 2.5 : salary;
    }


    public String toString() {
        return "\n" + "TopManager = Зарплата " + getMonthSalary();
    }
}
