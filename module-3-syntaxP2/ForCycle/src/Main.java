import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i+1) {
            for (int x = 1; x <= value; x = x+1) {
                if ( x*i == value ) {
                    System.out.println( i + "*" + x);

                }
            }
        }

    }
}
