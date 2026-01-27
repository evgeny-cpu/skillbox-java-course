public class CargoInfo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean turnOver;
    private final String registrationNumber;
    private final boolean fragile;

    public CargoInfo(Dimensions dimensions, double weight, String deliveryAddress, boolean turnOver, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.turnOver = turnOver;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public CargoInfo setDimensions(Dimensions dimensions) {
        return new CargoInfo(dimensions, weight, deliveryAddress, turnOver, registrationNumber, fragile);
    }

    public CargoInfo setWeight(double weight) {
        return new CargoInfo(dimensions, weight, deliveryAddress, turnOver, registrationNumber, fragile);
    }

    public CargoInfo setDeliveryAddress(String deliveryAddress) {
        return new CargoInfo(dimensions, weight, deliveryAddress, turnOver, registrationNumber, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isTurnOver() {
        return turnOver;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public boolean isFragile() {
        return fragile;
    }

    public String toString() {
        return "\n"
                + "Обьем груза: " + dimensions.cargoVolume() + "\n"
                + "Габариты: " + dimensions + "\n"
                + "Масса: " + weight + " кг " + "\n"
                + "Адрес доставки: " + deliveryAddress + "\n"
                + "Можно переворачивать? " + turnOver + "\n"
                + "Регистрационный номер: " + registrationNumber + "\n"
                + "Хрупкость - " + fragile;
    }
}

