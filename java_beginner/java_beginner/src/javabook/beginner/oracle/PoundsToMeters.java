package javabook.beginner.oracle;

public class PoundsToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int count;

        for (inches = 1, count = 0; inches < 144; inches++, count++) {
            meters = inches / 39.37;
            System.out.println(meters);

            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }
    }
}
