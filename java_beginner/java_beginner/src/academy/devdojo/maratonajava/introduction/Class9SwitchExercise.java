package academy.devdojo.maratonajava.introduction;

public class Class9SwitchExercise {
    public static void main(String[] args) {
        byte dia = 2;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Non-Working Day");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
