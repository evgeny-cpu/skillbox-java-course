import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            String variable1 = scanner.nextLine();
            String operator = scanner.nextLine();
            String variable2 = scanner.nextLine();

            int one = Integer.parseInt(variable1);
            int two = Integer.parseInt(variable2);

            int result = 0;
            switch (operator) {
                case "+" -> result = one + two;
                case "-" -> result = one - two;
                case "*" -> result = one * two;
                case "/" -> {
                    if (two == 0) {
                        System.out.println("Делить на ноль нельзя");
                        return;
                    }
                    result = one / two;
                }
            }
            System.out.println(variable1 + " " + operator + " " + variable2 + " = " + result);
        }

    }
}