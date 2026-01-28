import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();

        final int CONTAINER_PER_TRUCK = 12;
        final int BOX_PER_CONTAINER = 27;

        int containers = 0;
        int trucks = 0;

        if (boxes > 0) {
            containers = 1;
            trucks = 1;
            System.out.println("Грузовик: " + trucks);
            System.out.println("\tКонтейнер: " + containers);

            for (int i = 1; i <= boxes; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % BOX_PER_CONTAINER == 0 && i < boxes) {
                    containers++;
                    if (containers % CONTAINER_PER_TRUCK == 1) {
                        trucks++;
                        System.out.println("Грузовик: " + trucks);
                    }
                    System.out.println("\tКонтейнер: " + containers);
                }
            }
        }

        System.out.println("Необходимо:" + System.lineSeparator() +
                "грузовиков - " + trucks + " шт." + System.lineSeparator() +
                "контейнеров - " + containers + " шт.");
    }
}