public class Main {
    public static void main(String[] args) {
        int vasyaAge = 20;
        int katyaAge = 10;
        int mishaAge = 15;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge <= mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = katyaAge;
            }
        }

        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            if (vasyaAge <= mishaAge) {
                middle = vasyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = vasyaAge;
            }
        }

        if (mishaAge <= katyaAge && mishaAge <= vasyaAge) {
            min = mishaAge;
            if (vasyaAge <= katyaAge) {
                middle = vasyaAge;
                max = katyaAge;
            } else {
                middle = katyaAge;
                max = vasyaAge;
            }
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
