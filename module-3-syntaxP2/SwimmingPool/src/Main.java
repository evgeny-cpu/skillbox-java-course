public class Main {
    public static void main(String[] args) {

        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentvolume = 0;
        int time = 0;

        while (true) {
            currentvolume = currentvolume + fillingSpeed - devastationSpeed;
            time = time + 1;
            if (currentvolume == volume) {
                break;
            }
        }
        System.out.println("Временя наполнения басейна " + time + " минут. ");
    }
}