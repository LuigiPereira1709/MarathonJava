package academy.devdojo.maratonajava.introduction;

public class Class7ConditionalExercise {
    public static void main(String[] args) {
        double salaryAnnual = 45000;
        double taxesA = 19.17 / 100;
        double taxesB = 37.07 / 100;
        double taxesC = 49.50 / 100;
        double taxAmount = salaryAnnual;

        if (salaryAnnual <= 35472) {
            taxAmount *= taxesA;
        } else if (salaryAnnual > 35472 && salaryAnnual <= 69398) {
            taxAmount *= taxesB;
        } else {
            taxAmount *= taxesC;
        }
        System.out.println(taxAmount);
    }
}
