import java.util.Scanner;

public class PhoneCleanerRegex {
    public static void main(String[] args) {
        String regex = "[^0-9]";
        String clear = "";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            clear = input.replaceAll(regex, "");
            if (clear.length() < 10 || clear.length() > 11) {
                System.out.println("Неверный формат номера");
                continue;
            }
            if (clear.length() == 10) {
                clear = "7" + clear;

            }
            if (clear.charAt(1) != '9') {
                System.out.println("Неверный формат номера");
                continue;
            }
            if (clear.charAt(0) == '8') {
                clear = clear.replaceAll("8", "7");
            }
            System.out.println(clear);
        }
    }
}
