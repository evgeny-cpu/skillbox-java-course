import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("'ООО' Фабрика окон");

        company.hire(new Manager(150_000,"Витька",LocalDate.of(2017,5,5)));
        company.hire(new TopManager(320_000,"Иван",LocalDate.of(2024,11,7),company) );
        company.hire(new Manager(50_000,"Алексей",LocalDate.of(2022,12,12)));
        company.hire(new Operator(80_000,"Федя", LocalDate.of(2021,12,12)));
        company.hire(new Operator(90_000,"Олег",LocalDate.of(2017,12,10)));
        company.hire(new Manager(120_000,"Николай",LocalDate.of(2011,5,19)));
        company.hire(new TopManager(300_000,"Игорь",LocalDate.of(2023,10,10),company));
        company.hire(new Manager(140_000,"Никита",LocalDate.of(2019,10,17)));






        company.calculateIncome();
        System.out.println(company.sort(10));
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой среди тех кто пришел в 2017 году");
        System.out.println(company.sortYear(2017));


    }
}
