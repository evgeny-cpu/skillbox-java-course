import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        int value = new Scanner(System.in).nextInt();
        int x = 1;
        for ( int i = 1; i <= value; i = i + 1){
            x = i * x;
        }
        System.out.println("Факториал введеного числа: " + value +"!");
        System.out.println("Равен " + x);
    }
}