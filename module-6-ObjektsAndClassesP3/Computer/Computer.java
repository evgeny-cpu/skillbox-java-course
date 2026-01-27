public class Computer {
    private CPU cpu;
    private RAM ram;
    private Memory memory;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;



    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public  double calculateWeightComputer() {
        return cpu.getWeight() + ram.getWeight() + memory.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Memory getMemory() {
        return memory;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "\n"
                + "Производитель: " + vendor + "\n"
                + "Название: " + name + "\n"
                + "CPU: " + cpu + "\n"
                + "RAM: " + ram + "\n"
                + "Memory: " + memory + "\n"
                + "Screen: " + screen + "\n"
                + "Keyboard: " + keyboard;
    }
}

