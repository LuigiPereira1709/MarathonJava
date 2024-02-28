package academy.devdojo.maratonajava.introduction;

public class Class5IfElse {
    public static void main(String[] args) {
        int age = 14;
        String category;

        if (age < 15) {
            category = "Children's Category";
        } else if (age > 15 && age < 18) {
            category = "Youth Category";
        } else {
            category = "Adult Category";
        }
        System.out.println(category);
    }
}
