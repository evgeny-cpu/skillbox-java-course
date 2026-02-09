public class CalculateWages {
    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int total = 0;
        int count = 0;
        int maxSalary = 0;


        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                int start = i;
                int end = i;
                while (Character.isDigit(text.charAt(end)) && end < text.length()) {
                    end++;
                }
                int salary = Integer.parseInt(text.substring(start, end));
                total += salary;
                if (salary > maxSalary) {
                    maxSalary = salary;
                }
                i = end - 1;
                count++;
            }
        }
        System.out.println("Средняя сумма: " + total / count + " руб");
        System.out.println("Максимальная сумма: " + maxSalary);
        System.out.println("Вся сумма : " + total);
    }
}

