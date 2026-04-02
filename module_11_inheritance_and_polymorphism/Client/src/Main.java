public class Main {
    public static void main(String[] args) {

        PhysicalPerson person = new PhysicalPerson();
        LegalPerson legal = new LegalPerson();
        IndividualBusinessman ip = new IndividualBusinessman();


        person.put(500);
        legal.put(500);
        legal.take(200);
        ip.put(500);


        person.printInfo();
        System.out.println();
        legal.printInfo();
        System.out.println();
        ip.printInfo();

    }
}