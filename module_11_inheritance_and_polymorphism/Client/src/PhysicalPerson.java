public class PhysicalPerson extends Client{


    @Override
    public void printInfo() {
        System.out.println("Условия пополнения:  пополнение происходит без комиссии. ");
        System.out.println("Условия снятия: - списание происходит без комиссии. ");
        super.print();
    }
}
