import java.time.LocalDate;

public class Operator extends Personnel {

    public Operator(double fixSalary, String name, LocalDate date) {
        super(fixSalary, name, date);


    }

    @Override
    public String toString() {
        return "\n" + "Оператор - " + getName() + " Фиксированная зарплата: " + getSalary() +  " * " + "Устроился на работу: " + getDate();
    }


}