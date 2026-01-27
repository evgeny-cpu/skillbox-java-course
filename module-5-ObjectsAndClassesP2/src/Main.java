import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(-3,25);
        int  flor = new Scanner(System.in).nextInt();

        while (true){

            elevator.move(flor);
        }

    }
}