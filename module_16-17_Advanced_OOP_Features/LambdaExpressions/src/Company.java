import java.util.*;

public class Company {
    public String name;
    private double income;
    private List<Personnel> personal;

    public void calculateIncome() {
        income = personal.stream().mapToDouble(Personnel::getEarnMoneyCompany).sum();
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

    public List<Personnel> sort(int count) {
        if (count < 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(personal.stream().sorted(Comparator.comparing(Personnel::getMonthSalary).thenComparing(Personnel::getName)).limit(count).toList());
    }

    public Optional<Personnel> sortYear(int year) {
        return personal.stream().filter(s1 -> s1.getDate().getYear() == year)
                .max(Comparator.comparing(Personnel::getMonthSalary));
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