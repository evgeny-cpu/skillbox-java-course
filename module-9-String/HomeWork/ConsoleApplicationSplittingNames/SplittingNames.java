public class SplittingNames {
    public static void main(String[] args) {

        String name = "Беллинсгаузен Васисуалий Никифорович";

        System.out.println(getNames(name));

    }

    public static String getNames(String names) {
        int start = names.indexOf(" ");
        int end = names.lastIndexOf(" ");
        if (start < 0 || end < 0){
            return "";
        }
        String firstName = names.substring(0,start);
        String name = names.substring(start,end).trim();
        String lastName = names.substring(end).trim();

        return "Фамилия: " + firstName + "\n" +
                "Имя: " + name + "\n" +
                "Отчество: " + lastName;
    }
}
