public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumNumbers() {
        int sum = a + b;
        System.out.println("Сумма чисел : " + sum);
        return sum;
    }

    public int productsNumbers() {
        int sum = a * b;
        System.out.println("Произведение чисел : " + sum);
        return sum;
    }

    public int maximumTwoNumbers() {
        int sum = a > b ? a : b;
        System.out.println("Максимальное из двух чисел: " + sum);
        return sum;
    }

    public int minimumTwoNumbers() {
        int sum = a < b ? a : b;
        System.out.println("Минимальное из двух чисел: " + sum);
        return sum;
    }

}
