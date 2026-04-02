public class Main {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
        bankAccount.put(2000);
        CardAccount card= new CardAccount();
        card.put(2000);
        DepositAccount deposit= new DepositAccount();
        deposit.put(2000);



        bankAccount.take(500);
        card.take(500);
        deposit.take(500);

        System.out.println("Баланс банк: " + bankAccount.getBalance());
        System.out.println("Карта : " + card.getBalance());
        System.out.println("Депосит: " + deposit.getBalance());
    }
}