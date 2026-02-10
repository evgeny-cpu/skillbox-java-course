public class SplitText {
    public static void main(String[] args) {
        String text = "In our fast-paced digital age, the simple act of reading a physical book remains a profound joy." +
                " There's something irreplaceable about the texture of paper under your fingers, the subtle smell of ink and glue, and the satisfying weight of a volume in your hands. " +
                "A book is a portal, offering an escape into different worlds, eras, and perspectives without the need for a battery or a Wi-Fi signal. " +
                "It demands our full attention, creating a quiet space for focus and deep thought that is often shattered by the constant pings of notifications. " +
                "While e-readers are convenient, they lack the tangible history of a well-loved book—the creased spine, the faded cover, the marginal notes from a previous reader. " +
                "Books are not just containers of stories; they are artifacts of human experience, patiently waiting on a shelf to share their magic with anyone willing to turn the page. " +
                "This enduring physicality makes them a sanctuary for the mind and a timeless treasure in an ephemeral world.";

        System.out.println(splitTextIntoWords(text));
    }

    public static String splitTextIntoWords(String text) {
        if (text.isEmpty()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        String regex = "[^A-Za-z]+";
        result.append(text.replaceAll(regex,"\n"));
        return result.toString().trim();
    }
}