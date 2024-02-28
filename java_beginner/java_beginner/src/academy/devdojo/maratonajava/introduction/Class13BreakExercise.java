package academy.devdojo.maratonajava.introduction;

public class Class13BreakExercise {
    public static void main(String[] args) {
        double carValue = 400;
        double installmentValue = 1000;
        int installmentCount = 0;

        for (int i = 0; i < carValue; i++) {
            if (carValue / i <= installmentValue) {
                break;
            }
            installmentCount = i;
        }
        System.out.println(installmentCount);
    }
}
