package Lesson_2_3;

public class Student {
    private String name;
    private Float grade;

    public Student(String name, Float grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", grade=" + grade + '}';
    }
}
