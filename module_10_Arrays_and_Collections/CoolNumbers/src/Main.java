import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayCoolNumber = generateCoolNumbers();
        HashSet<String> hashSetCoolNumber = new HashSet<>(arrayCoolNumber);
        TreeSet<String> treeSetCoolNumber = new TreeSet<>(arrayCoolNumber);

        String target = arrayCoolNumber.get(2_500_000);

        long start = System.nanoTime();
        boolean contains = bruteSearch(arrayCoolNumber, target);
        System.out.println("Поиск перебором: " + (contains ? "найден" : "не найден") + " поиск занял " + (System.nanoTime() - start) + " нс");

        Collections.sort(arrayCoolNumber);
        long startBin = System.nanoTime();
        boolean containsBin = binarySearch(arrayCoolNumber, target);
        System.out.println("Поиск бинарный: " + (containsBin ? "найден" : "не найден") + " поиск занял " + (System.nanoTime() - startBin) + " нс");

        long startHashSet = System.nanoTime();
        boolean containsHashSet = hashSetSearch(hashSetCoolNumber, target);
        System.out.println("Поиск в HashSet: " + (containsHashSet ? "найден" : "не найден") + " поиск занял " + (System.nanoTime() - startHashSet) + " нс");

        long startTreeSet = System.nanoTime();
        boolean containsTreeSet = treeSetSearch(treeSetCoolNumber, target);
        System.out.println("Поиск в TreeSet: " + (containsTreeSet ? "найден" : "не найден") + " поиск занял " + (System.nanoTime() - startTreeSet));


    }

    public static boolean bruteSearch(ArrayList<String> list, String target) {
        return list.contains(target);
    }

    public static boolean binarySearch(ArrayList<String> list, String target) {
        int x = Collections.binarySearch(list, target);
        return x >= 0 ? true : false;
    }

    public static boolean hashSetSearch(HashSet<String> hashSet, String target) {
        return hashSet.contains(target);
    }

    public static boolean treeSetSearch(TreeSet<String> treeSet, String target) {
        return treeSet.contains(target);
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
                            result.append(letter).append(digit).append(digit).append(digit).append(first).append(two).append(region < 10 ? "0" + region : region);
                            list.add(result.toString());
                            result.setLength(0);
                            if (list.size() >= 3_000_000) {
                                return list;
                            }

                        }
                    }
                }
            }
        }
        return list;

    }
}