public class Memory {
    private final MemoryType type;
    private final double volume;
    private final double weight;


    public Memory(MemoryType type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public MemoryType getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n"
                + "Тип памяти: " + type + "\n"
                + "Объем памяти: " + volume + "\n"
                + "Вес: " + weight;
    }
}
