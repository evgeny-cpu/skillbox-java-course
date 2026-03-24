import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String isError = "Неверный формат ввода";

        System.out.println("Введите номер, имя или команду:");
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equals("EXIT")) {
                break;
            }
            if (input.equals("LIST")) {
                System.out.println(phoneBook.list());
                continue;
            }

            if (phoneBook.checkingName(input)) {
                if (!phoneBook.searchName(input)) {
                    System.out.println("Такого имени в телефонной книге нет.");
                    System.out.printf("Введите номер телефона для абонента '%s' :", input);
                    String phone = scanner.nextLine();
                    if (phoneBook.checkingPhone(phone)) {
                        phoneBook.addContact(input, phone);
                        System.out.println("Контакт сохранен");
                    } else {
                        System.out.println(isError);
                    }
                }else{
                    System.out.println(phoneBook.findReceiveName(input));

                }
            } else {
                if (phoneBook.checkingPhone(input)) {
                    if (!phoneBook.searchPhone(input)) {
                        System.out.println("Такого номера нет в телефонной книге.");
                        System.out.printf("Введите имя абонента для номера '%s' :", input);
                        String name = scanner.nextLine();
                        if (phoneBook.checkingName(name)){
                            phoneBook.addContact(name, input);
                            System.out.println("Контакт сохранен");
                        }else{
                            System.out.println(isError);
                        }
                    } else {
                        System.out.println(phoneBook.findReceivePhone(input));
                    }
                } else {
                    System.out.println(isError);
                }
                {

                }
            }

        }
    }
}

