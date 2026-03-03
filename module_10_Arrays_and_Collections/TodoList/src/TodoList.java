import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list = new ArrayList<>();

    public void add(String[] text) {
        int index = -1;
        int startIndex = 1;
        StringBuilder task = new StringBuilder();
        if (text.length > 1 && text[1].matches("\\d+")) {
            index = Integer.parseInt(text[1]);
            startIndex = 2;
        }
        for (int i = startIndex; i < text.length; i++) {
            task.append(text[i]).append(" ");
        }
        System.out.println("Добавлено дело " + task);

        if (index >= 0 && index < list.size()) {
            list.add(index, task.toString().trim());
        } else {
            list.add(task.toString().trim());
        }
    }

    public void list() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(String.format("%d - %s", i, list.get(i))).append("\n");
        }
        System.out.println(result);

    }

    public void edit(String[] text) {
        if (text.length < 3) {
            System.out.println("Введите: EDIT номер дела");
            return;
        }
        int value = Integer.parseInt(text[1]);
        if (value < 0 || value >= list.size()) {
            System.out.println("Дело с таким номером не существует");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < text.length; i++) {
            result.append(text[i]).append(" ");
        }
        System.out.println("Дело " + list.get(value) + " заменено на " + result);
        list.set(value, result.toString());

    }

    public void delete(String[] message) {
        if (message.length <= 1) {
            return;
        }
        int number = Integer.parseInt(message[1]);
        if (number < 0 || number >= list.size()) {
            System.out.println("Дело с таким номером не существует");
            return;
        }
        System.out.println("Дело " + list.get(number) + " удалено");
        list.remove(number);
    }
}
