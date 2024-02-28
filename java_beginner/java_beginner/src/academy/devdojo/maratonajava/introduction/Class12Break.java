package academy.devdojo.maratonajava.introduction;

public class Class12Break {
    public static void main(String[] args) {
        int maxValue = 50;

        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
