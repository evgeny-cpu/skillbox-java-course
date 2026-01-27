public class Main {
    public static void main(String[] args) {

        System.out.println("Система рассчёта стоимости топлива");

        int fuelType = 92;
        int amount = 50;
        int maxAmount = 200;

        double fuelTypePrice92 = 2.5;
        double fuelTypePrice95 = 2.6;
        boolean discount = amount > 10;

        double fuelPrice = 0.0;

        if (fuelType == 92) {
            fuelPrice = fuelTypePrice92;
        } else if (fuelType == 95) {
            fuelPrice = fuelTypePrice95;
        } else {
            System.out.println("Выбран неверный тип топлива");
        }

        if (amount < 1) {
            amount = 0;
            System.out.println("Вы ввели отрицательное количество топлива");
        }

        if (amount > maxAmount) {
            amount = maxAmount;
            System.out.println("Вы превысили максимальное количество топлива");
        }

        if (discount) {
            fuelPrice -= fuelPrice * 0.1;
        }

        System.out.println("Стоимость выбранного топлива: " + fuelPrice);

        double totalPrice = (double) amount * fuelPrice;

        System.out.println("Общая стоимость заправки: " + totalPrice);
        System.out.println("Количество литров: " + amount);
    }
}