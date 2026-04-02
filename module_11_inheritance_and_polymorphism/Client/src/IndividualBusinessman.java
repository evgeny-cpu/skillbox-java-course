public class IndividualBusinessman extends Client {


    @Override
    public boolean put(double amount) {
        double commission = amount >= 1000 ? 0.005 : 0.01;
        return super.put(amount - (amount * commission));
    }

    @Override
    public void printInfo() {
        System.out.println("Условия пополнения: пополнение с комиссией 1% если сумма < 1000, сумма >= 1000 комиссия 0.5%  ");
        System.out.println("Условия снятия: - списание происходит без комиссии.");
        super.print();
    }
}
