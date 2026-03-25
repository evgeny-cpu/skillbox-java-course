import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayCoolNumber = generateCoolNumbers();
        HashSet<String> hashSetCoolNumber = new HashSet<>(arrayCoolNumber);
        TreeSet<String> treeSetCoolNumber = new TreeSet<>(arrayCoolNumber);

        String target = arrayCoolNumber.get(1_500_000);
        long start = System.nanoTime();
        boolean contains = arrayCoolNumber.contains(target);
        long finish = System.nanoTime() - start;
        System.out.println("Поиск перебором: " + (contains? "найден" : "не найден") + " поиск занял " + finish);

        Collections.sort(arrayCoolNumber);
        long startBin = System.nanoTime();
        int containsBin = Collections.binarySearch(arrayCoolNumber,target);
        long finiBin = System.nanoTime() - startBin;
        System.out.println("Поиск бинарный: " + (containsBin > 0? "найден" : "не найден") + " поиск занял " + finiBin);

        long startHashSet = System.nanoTime();
        boolean containsHashSet = hashSetCoolNumber.contains(target);
        long finishHashSet = System.nanoTime() - startHashSet;
        System.out.println("Поиск в HashSet: " + (containsHashSet? "найден" : "не найден") + " поиск занял " + finishHashSet);

        long startTreeSet = System.nanoTime();
        boolean containsTreeSet = treeSetCoolNumber.contains(target);
        long finishTreeSet = System.nanoTime() - startTreeSet;
        System.out.println("Поиск в TreeSet: " + (containsTreeSet? "найден" : "не найден") + " поиск занял " + finishTreeSet);





    }

    public static ArrayList<String> generateCoolNumbers() {
        char[] letters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        ArrayList<String> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (char letter : letters) {
            for (int digit = 1; digit <= 9; digit++) {
                for (char first : letters) {
                    for (char two : letters) {
                        for (int region = 0; region <= 199; region++) {
                            result.append(letter).append(digit).append(digit).append(digit).append(first).append(two).append(region < 10? "0" + region : region);
                            list.add(result.toString());
                            result.setLength(0);

                        }
                    }
                }
            }
        }
        return list;

    }
}