import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Список команд:");
        System.out.println("LIST — выводит список электронных адресов.");
        System.out.println("ADD — проверяет и, если формат адреса верный, добавляет в множество.");
        System.out.println("CLEAR — очистить список.");
        System.out.println("REMOVE — удалить электронный адрес.");
        System.out.println("EXIT — выход из программы.");
        System.out.println("Введите email" + "\n");

        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("EXIT")) {
                break;
            }
            String[] words = input.split(" ");

            switch (words[0]) {
                case "ADD" -> {
                    if (emailList.add(input)) {
                        System.out.println("Почта добавлена!");
                    } else {
                        System.out.println("Ошибка: Неверный формат");
                    }
                }
                case "LIST" -> System.out.println(emailList.list());
                case "CLEAR" -> {
                    System.out.println("Список очищен.");
                    emailList.clear();
                }
                case "REMOVE" -> {
                    if (emailList.remove(input)) {
                        System.out.println("Почта удалена.");
                    } else {
                        System.out.println("В списке нету выбранной почты");
                    }
                }
                default -> System.out.println("Не верный формат команды");
            }
        }
    }
}
