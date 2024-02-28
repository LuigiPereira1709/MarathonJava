package academy.devdojo.maratonajava.introduction;

public class Class11ExerciseRepetitionStructures {
    public static void main(String[] args) {
        int count = 0;

        do {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;

        } while (count < 100);


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
