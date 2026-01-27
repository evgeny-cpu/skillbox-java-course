public class CPU {
    private final int frequency;
    private final int numberCores;
    private final Manufacturer manufacturer;
    private final double weight;

    public CPU(int frequency, int numberCores, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.numberCores = numberCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n"
                + "Частота процессора: " + frequency + " МГц " + "\n"
                + "Количество ядер: " + numberCores + "\n"
                + "Производитель: " + manufacturer + "\n"
                + "Вес: " + weight;
    }
}
