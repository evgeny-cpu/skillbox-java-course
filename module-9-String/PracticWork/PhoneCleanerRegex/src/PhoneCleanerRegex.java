import java.util.Scanner;

public class PhoneCleanerRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            String clear = input.replaceAll("[^0-9]", "");

            if (clear.length() < 10 || clear.length() > 11) {
                System.out.println("Неверный формат номера");
                continue;
            }

            String result;
            if (clear.length() == 10) {
                result = "7" + clear;
            } else {
                char firstChar = clear.charAt(0);
                if (firstChar == '7') {
                    result = clear;
                } else if (firstChar == '8') {
                    result = "7" + clear.substring(1);
                } else {
                    System.out.println("Неверный формат номера");
                    continue;
                }
            }

            if (result.matches("^79[0-9]{9}$")) {
                System.out.println(result);
            } else {
                System.out.println("Неверный формат номера");
            }
        }
    }
}