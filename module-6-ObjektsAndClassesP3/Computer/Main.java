public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU(3800, 8, Manufacturer.AMD, 0.030);
        RAM ram = new RAM(RAMType.LPDDR5, 16000, 0.027);
        Memory memory = new Memory(MemoryType.SSD, 512, 0.029);
        Screen screen = new Screen(15.6, ScreenType.IPS, 1.500);
        Keyboard keyboard = new Keyboard(keyboardType.membrane, PresenceBacklight.YES, 0.200);

        Computer computer = new Computer("Xiaomi", "RedmiBookPro");

        computer.setCpu(cpu);
        computer.setRam(ram);
        computer.setMemory(memory);
        computer.setScreen(screen);
        computer.setKeyboard(keyboard);

        System.out.println("Laptop: " + computer);
        System.out.println("Общий вес устройства: " + computer.calculateWeightComputer() + " кг");

        System.out.println();


        CPU cpu1 = new CPU(2300, 6, Manufacturer.AMD, 0.029);
        RAM ram1 = new RAM(RAMType.LPDDR4, 16000, 0.030);
        Memory memory1 = new Memory(MemoryType.SSD, 512, 0.030);
        Screen screen1 = new Screen(16, ScreenType.IPS, 1.500);
        Keyboard keyboard1 = new Keyboard(keyboardType.membrane, PresenceBacklight.YES, 0.200);

        Computer computer1 = new Computer("Infinix", "Y3 Max");
        computer1.setCpu(cpu1);
        computer1.setRam(ram1);
        computer1.setMemory(memory1);
        computer1.setScreen(screen1);
        computer1.setKeyboard(keyboard1);

        System.out.println("Laptop: " + computer1);
        System.out.println("Общий вес устройства: " + computer1.calculateWeightComputer() + " кг");
    }
}