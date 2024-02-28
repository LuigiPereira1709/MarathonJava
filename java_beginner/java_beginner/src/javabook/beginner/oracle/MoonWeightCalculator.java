package javabook.beginner.oracle;

public class MoonWeightCalculator {
    public static void main(String[] args) {
        double gravityEarth, gravityMoon, weightKgEarth, weightKgMoon;

        gravityEarth = 9.8;
        gravityMoon = 1.6;

        weightKgEarth = 70;
        weightKgMoon = (weightKgEarth * gravityEarth) / gravityMoon;

        System.out.println(weightKgMoon);
    }
}
