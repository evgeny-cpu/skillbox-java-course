package ConsoleCustomerList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerStorage customerStorage = new CustomerStorage();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список доступных команды");
        System.out.println("add - добавить пользователя (Формат: имя телефон почта)");
        System.out.println("list - показать всех клиентов");
        System.out.println("update - обновить данные клиента ( Формат: update старый телефон имя телефон почта)");
        System.out.println("delete - удалить клиента (Формат: delete телефон)");
        System.out.println("exit - выход");
        System.out.println("Выполните действие.");
        System.out.println();

        while (true) {
            String text = scanner.nextLine().trim();
            if (text.isEmpty()){
                continue;
            }
            if (text.equals("exit")) {
                break;
            }

            if (text.startsWith("add ")) {
                try {
                    String customer = text.substring(4).trim();
                    customerStorage.add(customer);
                    System.out.println("Клиент добавлен.");
                } catch (InvalidCommandFormatException | InvalidPhoneNumberException | InvalidEmailException |
                         DuplicateCustomerException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Неизвестная ошибка: " + e.getMessage());
                }
            } else if (text.equals("list")) {
                if (customerStorage.getCustomerList().isEmpty()) {
                    System.out.println("Список пуст.");
                } else {
                    customerStorage.list();
                }

            } else if (text.startsWith("update ")) {
                try {
                    String[] parts = text.substring(7).trim().split("\\s+", 2);
                    if (parts.length != 2) {
                        System.out.println("Ошибка: Не верный формат.");
                        continue;
                    }
                    String phone = parts[0];
                    String customer = parts[1];
                    if (customerStorage.update(phone, customer)) {
                        System.out.println("Клиент обновлен.");
                    } else {
                        System.out.println("Такого клиента нет.");
                    }
                } catch (InvalidCommandFormatException | InvalidPhoneNumberException | InvalidEmailException | DuplicateCustomerException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (text.startsWith("delete ")) {
                String phone = text.substring(7).trim();
                if (phone.isEmpty()) {
                    System.out.println("Ошибка: Укажите номер телефона");
                }else if (customerStorage.delete(phone)) {
                    System.out.println("Клиент удалён - " + phone);
                } else {
                    System.out.println("Клиента нет в списке");
                }
            }else{
                System.out.println("Неизвестная команда.");
        }
    }
}
}
