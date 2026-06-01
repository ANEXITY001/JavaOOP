import java.util.Comparator;

public class StudentShortByName implements Comparator<Student> {
    String name;
    int age;

//    public StudentShortByName(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
