public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());


        System.out.println("Заглавные буквы");
        for (char c = 'А'; c <= 'Я'; c++) {
            if (c == 'Ж') {
                char e = 'Ё';
                System.out.println(e + " - " + (int) e);
            }
            System.out.println(c + " - " + (int) c);
        }

        System.out.println();

        System.out.println("Строчные буквы");
        for (char c = 'а'; c <= 'я'; c++) {
            if (c == 'ж') {
                char e1 = 'ё';
                System.out.println(e1 + " - " + (int) e1);
            }
            System.out.println(c + " - " + (int) c);
        }

    }
}