public class Operator extends Personnel {

    public Operator(double fixSalary) {
        super(fixSalary);

    }

    @Override
    public String toString() {
        return "\n" + "Operator{" +
                "Фиксированная зарплата = " + getSalary() +
                '}';
    }


}
