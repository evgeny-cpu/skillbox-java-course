import java.util.*;

public class Company {
    public String name;
    private double income;
    protected List<Personnel> personal;

    public void calculateIncome() {
        income = 0;
        for (Personnel personnel : personal) {
            income += personnel.getEarnMoneyCompany();
        }
    }


    public Company(String name) {
        personal = new ArrayList<>();
        this.name = name;
        income = 0;

    }

    public void hire(Personnel personnel) {
        this.personal.add(personnel);


    }

    public void hireAll(List<Personnel> list) {
        personal.addAll(list);

    }

    public void fire(int count) {
        if (count > personal.size()) {
            return;
        }
        int i = 0;
        Collections.shuffle(personal);
        Iterator<Personnel> iterator = personal.iterator();
        while (iterator.hasNext() && i < count) {
            iterator.next();
            iterator.remove();
            i++;
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count < 0) {
            return new ArrayList<>();
        }
        personal.sort((p1, p2) -> Double.compare(p2.getMonthSalary(), p1.getMonthSalary()));
        int limit = Math.min(count, personal.size());
        return new ArrayList<>(personal.subList(0, limit));
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count < 0) {
            return new ArrayList<>();
        }
        personal.sort((p1, p2) -> -Double.compare(p2.getMonthSalary(), p1.getMonthSalary()));
        int limit = Math.min(count, personal.size());
        return new ArrayList<>(personal.subList(0, limit));
    }


    public double getIncome() {
        return income;
    }


    @Override
    public String toString() {
        return "Company{" +
                "Название: " + name + '\'' +
                ", Компания заработала: " + income +
                ", Персонал: " + personal +
                '}';
    }
}
