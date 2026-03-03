import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        String menu = "Список доступных команд: " + "\n" +
                "EXIT — выход из программы." + "\n" +
                "LIST — выводит дела с их порядковыми номерами." + "\n" +
                "ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, " +
                "если указать номер; если указан несуществующий индекс - добавить в конец списка." + "\n" +
                "EDIT — заменяет дело с указанным номером; если указан несуществующий индекс - ничего не делать." + "\n" +
                "DELETE — удаляет; если указан несуществующий индекс - ничего не делать.";
        System.out.println(menu);

        while (true) {
            String team = scanner.nextLine();
            if (team.equals("EXIT")) {
                System.out.println("Программа закончила свою работу");
                break;
            }
            String[] message = team.split(" ");

            switch (message[0]) {
                case "ADD" -> list.add(message);
                case "LIST" -> list.list();
                case "EDIT" -> list.edit(message);
                case "DELETE" -> list.delete(message);
                default -> System.out.println("Нету такой команды");
            }
        }

    }
}

