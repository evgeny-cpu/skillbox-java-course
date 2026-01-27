public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        currentFloor = 1;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
         currentFloor = currentFloor < maxFloor? currentFloor + 1: currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor? currentFloor - 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Ошибка, выбранный этаж не существует");
            return;
        }
        if (floor > currentFloor) {
            while (currentFloor != floor) {
                moveUp();
                System.out.println("Этаж: " + currentFloor + " ↓ ");
            }
        } else if (floor < currentFloor) {
            while (currentFloor != floor) {
                moveDown();
                System.out.println("Этаж: " + currentFloor + " ↓ ");
            }
        }
    }
}



