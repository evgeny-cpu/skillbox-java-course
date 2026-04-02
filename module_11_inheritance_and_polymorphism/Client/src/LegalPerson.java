public class LegalPerson extends Client {


    @Override
    public boolean take(double amount) {
        double sum = amount * 1.01;
        return super.take(sum);

    }

    @Override
    public void printInfo() {
        System.out.println("Условия пополнения:  пополнение происходит без комиссии. ");
        System.out.println("Условия снятия: -  снятие с комиссией 1%. ");
        super.print();
    }

}
