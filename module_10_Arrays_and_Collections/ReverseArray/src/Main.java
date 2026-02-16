public class Main {
    public static void main(String[] args) {

        String text = "Каждый охотник желает знать, где сидит фазан.";

        String[] words = text.split("[,.\\s]+");
        String[] reverseWords = new String[words.length];

        for (int i = 0; i < words.length ; i++) {
            reverseWords[i] = words[words.length - i - 1];
        }
        for (String s : reverseWords) {
            System.out.println(s);
        }
    }
}

