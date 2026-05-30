package ConsoleCustomerList;
import ConsoleCustomerList.exception.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class CustomerStorage {
    private static final Logger logger = LogManager.getLogger(CustomerStorage.class);
    private static final Logger searchLogger = LogManager.getLogger("searchLogger");
    private static final Logger inputErrorsLogger = LogManager.getLogger("inputErrorsLogger");
    private static final Logger exceptionsLogger = LogManager.getLogger("exceptionsLogger");

    private HashMap<String, Customer> customerList;

    public CustomerStorage() {
        customerList = new HashMap<>();
        searchLogger.info("Хранилище инициализировано");
    }

    public void add(String message) throws RuntimeException {
        String[] words = message.trim().split("\\s+");

        if (words.length != 4) {
            logger.warn("Неверное количество полей: {}", message);
            throw new InvalidCommandFormatException("Ошибка: Неверный формат ввода");
        }
        String name = words[0] + " " + words[1];
        String phone = words[2];
        String email = words[3];


        if (!phone.matches("\\d{11}")) {
            logger.warn("Неверный формат телефона: {}",message);
            throw new InvalidPhoneNumberException("Ошибка: Номер телефона должен быть из 11 цифр");
        }
        if (!email.contains("@") || !email.contains(".")) {
            logger.warn("Неверный формат email: {}",message);
            throw new InvalidEmailException("Ошибка: Отсутствует @ или точка");
        }
        if (customerList.containsKey(phone)) {
            logger.warn("Попытка добавить существующий номер: {}",message);
            throw new DuplicateCustomerException("Ошибка: Данный пользователь зарегистрирован");
        }
        customerList.put(phone, new Customer(name, phone, email));
        logger.info("Клиент добавлен: {} - {}",name,phone);
    }

    public void list() {
        if (customerEmpty()) {
            logger.info("Список клиентов пуст!");
            return;
        }
        logger.info("Запрошенный список клиентов количество {}",customerList.size());
        customerList.forEach((key, name) -> System.out.println(key + " " + name));
    }

    public boolean update(String phoneNumber, String customer) throws InvalidCommandFormatException, InvalidPhoneNumberException, InvalidEmailException, DuplicateCustomerException {
        if (!customerList.containsKey(phoneNumber)){
            logger.warn("Попытка обновить несуществующий номер: {}",phoneNumber);
            return false;
        }
        String[] words = customer.trim().split("\\s+");

        if (words.length != 4) {
            logger.warn("Неверный формат данных: {}",customer);
            throw new InvalidCommandFormatException("Неверный формат ввода.");
        }
        String name = words[0] + " " + words[1];
        String phone = words[2];
        String email = words[3];
        if (!phone.matches("\\d{11}")) {
            logger.warn("Неверный формат нового телефона: {}",phone);
            throw new InvalidPhoneNumberException("Номер телефона должен быть из 11 цифр");
        }
        if (!email.contains("@") || !email.contains(".")){
            logger.warn("Неверный формат нового email: {}",email);
            throw new InvalidEmailException("Отсутствует @ или .");
        }
        if (customerList.containsKey(name) && !customerList.get(name).getPhone().equals(phoneNumber)){
            logger.warn("Попытка добавить существующий номер");
            throw new DuplicateCustomerException("Клиент с таким именем уже существует");
        }
        customerList.remove(phoneNumber);
        customerList.put(phone, new Customer(name, phone, email));
        logger.info("Клиент обновлен: {} - {}",phoneNumber,phone);
        return true;
    }

    public boolean delete(String phone) {
        if (!customerEmpty() && customerList.containsKey(phone)) {
            customerList.remove(phone);
            logger.info("Клиент удален: {}",phone);
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
