public class Main {
    public static void main(String[] args) {

        char[][] arrays = getTwoDimensionalArray(7);
        printedArray(arrays);

    }

    public static void printedArray(char[][] chars) {
        for (char[] post : chars) {
            for (char line : post) {
                System.out.print(line);
            }
            System.out.println();
        }
    }

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] arrays = new char[size][size];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = i == j || i + j == size - 1 ? 'X' : ' ';
            }
        }
        return arrays;
    }
}
