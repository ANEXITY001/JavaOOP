public class Student implements Comparable<Student> {
    String name;
    int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "имя = " + name + '\'' +
                ", возраст = " + age + "}";
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;

        Student other = (Student) obj;
        return this.name.equals(other.name) && this.age == other.age;
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

    @Override
    public int compareTo(Student o) {
//        Student other = (Student) o;
        return Integer.compare(this.age, o.age);
    }
}
