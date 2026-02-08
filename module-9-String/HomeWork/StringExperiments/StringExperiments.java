import java.util.Scanner;

public class StringExperiments {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String value = scanner.nextLine();
            String value1 = scanner.nextLine();

            System.out.println(value.equalsIgnoreCase(value1) ? value + " == " + value1 : value + " != " + value1);

        }

    }
}
