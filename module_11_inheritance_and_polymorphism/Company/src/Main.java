import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("'ООО' Фабрика окон");

        company.hireAll(listPersonalOperator(180, 80_000));
        company.hireAll(listPersonalManager(80, 100_000));
        company.hireAll(listPersonalTopManager(10, 120_000, company));

        company.calculateIncome();
        System.out.println(company.getIncome());
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
        company.fire(135);
        company.calculateIncome();
        System.out.println(company.getIncome());

        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
        company.calculateIncome();

    }


    public static List<Personnel> listPersonalOperator(int count, double salary) {
        List<Personnel> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Operator(salary));
        }
        return list;
    }

    public static List<Personnel> listPersonalManager(int count, double salary) {
        List<Personnel> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Manager(salary));
        }
        return list;
    }

    public static List<Personnel> listPersonalTopManager(int count, double salary, Company company) {
        List<Personnel> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new TopManager(salary, company));
        }
        return list;
    }

}
