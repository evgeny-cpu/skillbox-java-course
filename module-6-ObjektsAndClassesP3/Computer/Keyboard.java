public class Keyboard {
    private final keyboardType type;
    private final PresenceBacklight backlight;
    private final double weight;


    public Keyboard(keyboardType type, PresenceBacklight backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }


    public keyboardType getType() {
        return type;
    }

    public PresenceBacklight getBacklight() {
        return backlight;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n"
                + "Тип клавиатуры: " + type + "\n"
                + "Подсветка: " + backlight + "\n"
                + "Вес: " + weight;
    }
}
