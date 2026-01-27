public class RAM {
    private final RAMType type;
    private final double volume;
    private final double weight;

    public RAM(RAMType type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RAMType getType() {
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
