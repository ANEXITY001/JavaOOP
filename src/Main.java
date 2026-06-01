import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("майк", 17);
        Student student2 = new Student("майк", 17);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student1));


//        comparable
        Student[] arrNames = {
                new Student("Саша", 20),
                new Student("Паша", 18),
                new Student("Макс", 21),
                new Student("Сергей", 19),
                new Student("Мария", 20),
                new Student("Мика", 17),
                new Student("Майя", 21)

        };
//
//        Arrays.sort(arrName);
//
//        System.out.println("By comparable");


//        comparator

//        Arrays.sort(arrNames, new StudentShortByName());
//
//        System.out.println("by Comparator ...");
//        for (Student arrName : arrNames)  {
//            System.out.println(arrName.name);
//        }

//        Comparator - comparing

//        with 1 parameter

        Arrays.sort(arrNames, Comparator.comparing(s -> s.name));

        System.out.println("Comparator - comparing");
        for (Student arrName : arrNames) {
            System.out.println(arrName.name);
        }


//        with 2 parameter

        Arrays.sort(arrNames, Comparator.comparing((Student student) -> student.name)
                .thenComparing(student -> student.name));


        System.out.println("Comparator - comparing() with 2 parameter");
        for (Student arrName : arrNames) {
            System.out.println(arrName.age + " " + arrName.name);
        }
    }
}