package academy.devdojo.maratonajava.introduction;

public class Class10WhileAndFor {
    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println(count);
        } while (++count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
