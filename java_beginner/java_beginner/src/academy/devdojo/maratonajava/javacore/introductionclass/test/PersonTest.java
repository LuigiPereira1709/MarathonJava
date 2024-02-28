package academy.devdojo.maratonajava.javacore.introductionclass.test;

import academy.devdojo.maratonajava.javacore.introductionclass.domain.Student;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Luigi";
        student.age = 20;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

    }
}
