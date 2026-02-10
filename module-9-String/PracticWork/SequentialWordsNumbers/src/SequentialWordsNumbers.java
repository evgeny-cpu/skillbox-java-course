public class SequentialWordsNumbers {
    public static void main(String[] args) {

        String text = "Это просто текст, для примера работы программы";


        System.out.println(sequentialWordsNumbers(text));
    }

    public static String sequentialWordsNumbers(String text) {
        if (text.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        int number = 1;
        int start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                int end = i + 1;
                builder.append("(").append(number).append(")").append(" ").append(text.substring(start, end));
                number++;
                start = end;
            }
            if (i == text.length() - 1){
                builder.append("(").append(number).append(")").append(" ").append(text.substring(start));
            }
        }
        return builder.toString();
    }
}
