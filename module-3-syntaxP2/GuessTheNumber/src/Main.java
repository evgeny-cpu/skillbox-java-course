import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Повеселимся! Угадай число ! =) ");
        int value = new Random().nextInt(100);

        while (true){
            int attempt = new Scanner(System.in).nextInt();
            if ( attempt == value){
                System.out.println("Вы угадали!");
                break;
            } else if (attempt< value){
                System.out.println("Загаданое число больше");
            }else {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}