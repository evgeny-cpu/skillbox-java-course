package ConsoleCustomerList;

import java.util.HashMap;

public class CustomerStorage {
    private HashMap<String, Customer> customerList;

    public CustomerStorage() {
        customerList = new HashMap<>();
    }

    public void add(String message) throws RuntimeException {
        String[] words = message.trim().split("\\s+");

        if (words.length != 4) {
            throw new InvalidCommandFormatException("Ошибка: Неверный формат ввода");
        }
        String name = words[0] + " " + words[1];
        String phone = words[2];
        String email = words[3];


        if (!phone.matches("\\d{11}")) {
            System.out.println(phone);
            throw new InvalidPhoneNumberException("Ошибка: Номер телефона должен быть из 11 цифр");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("Ошибка: Отсутствует @ или точка");
        }
        if (customerList.containsKey(phone)) {
            throw new DuplicateCustomerException("Ошибка: Данный пользователь зарегистрирован");
        }
        customerList.put(phone, new Customer(name, phone, email));
    }

    public void list() {
        if (customerEmpty()) {
            return;
        }
        customerList.forEach((key, name) -> System.out.println(key + " " + name));
    }

    public boolean update(String phoneNumber, String customer) throws InvalidCommandFormatException, InvalidPhoneNumberException, InvalidEmailException, DuplicateCustomerException {
        if (!customerList.containsKey(phoneNumber)) return false;
        String[] words = customer.trim().split("\\s+");
        if (words.length != 4) throw new InvalidCommandFormatException("Неверный формат ввода.");
        String name = words[0] + " " + words[1];
        String phone = words[2];
        String email = words[3];
        if (!phone.matches("\\d{11}")) throw new InvalidPhoneNumberException("Номер телефона должен быть из 11 цифр");
        if (!email.contains("@") || !email.contains(".")) throw new InvalidEmailException("Отсутствует @ или .");
        if (customerList.containsKey(name) && !customerList.get(name).getPhone().equals(phoneNumber)) throw new DuplicateCustomerException("Клиент с таким именем уже существует");
        customerList.remove(phoneNumber);
        customerList.put(phone, new Customer(name, phone, email));

        return true;
    }

    public boolean delete(String phone) {
        if (!customerEmpty() && customerList.containsKey(phone)) {
            customerList.remove(phone);
            return true;
        }
        return false;
    }

    public HashMap<String, Customer> getCustomerList() {
        return customerList;
    }

    private boolean customerEmpty() {
        return customerList.isEmpty();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
