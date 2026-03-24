import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private TreeMap<String, String> contact;

    public PhoneBook() {
        this.contact = new TreeMap<>();
    }

    public void addContact(String name, String phone) {
        if (!name.isEmpty() && !phone.isEmpty()) {
            if (!contact.containsKey(name)) {
                contact.put(name, phone);
            } else {
                contact.put(name, contact.get(name) + ", " + phone);
            }
        }
    }

    public String findReceiveName(String name) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> contacts : contact.entrySet()) {
            if (contacts.getKey().contains(name)) {
                result.append(contacts.getKey());
                result.append(" - ");
                result.append(contacts.getValue());
                result.append("\n");
            }
        }
        return result.toString();
    }

    public String findReceivePhone(String phone) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> contacts : contact.entrySet()) {
            if (contacts.getValue().contains(phone)) {
                result.append(contacts.getKey());
                result.append(" - ");
                result.append(contacts.getValue());
                result.append("\n");
            }
        }
        return result.toString();
    }

    public boolean searchName(String name) {
        return contact.containsKey(name);
    }

    public boolean searchPhone(String phone) {
        return !findReceivePhone(phone).isEmpty();
    }


    public boolean checkingName(String name) {
        return name.matches("(?iu)[а-я]+");
    }

    public boolean checkingPhone(String number) {
        return number.matches("[0-9]{11}");
    }

    public String list() {
        return toString();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> contact : contact.entrySet()) {
            result.append(contact.getKey());
            result.append(" - ");
            result.append(contact.getValue());
            result.append("\n");
        }
        return result.toString();
    }
}
