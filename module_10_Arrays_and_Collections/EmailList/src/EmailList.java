import java.util.TreeSet;

public class EmailList {
    TreeSet<String> emails = new TreeSet<>();


    public boolean add(String input) {
        String email = clearStr(input);
        if (!checkEmail(email)) {
            return false;
        }
        return emails.add(email.toLowerCase());
    }

    public String list() {
        StringBuilder result = new StringBuilder();
        for (String s : emails) {
            result.append(s).append("\n");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "Email= " + emails;
    }

    private String clearStr(String words) {
        String[] message = words.split(" ",2);
        return message.length > 1 ? message[1].trim() : "";
    }

    public void clear() {
        emails.clear();
    }

    public boolean remove(String text) {
        String result = clearStr(text);
        return emails.remove(result.toLowerCase());
    }

    private boolean checkEmail(String words) {
        return words.matches("(?i)[a-z0-9]{1,24}@[a-z0-9]+\\.[a-z]{2,}");

    }
}
