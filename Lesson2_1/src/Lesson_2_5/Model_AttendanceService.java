package Lesson_2_5;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Model_AttendanceService {
    private List<Student> students;
    private String dbFileName = "students.db";

    public Model_AttendanceService() {
        this.students = new ArrayList<>();
    }

    public void addStudent (String name) {
        students.add(new Student(name));
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Student getStudent(String name) {
        return students.get(students.indexOf(name));
    }

    public void bookFill() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(dbFileName)));
            String studentName = br.readLine();
            while (studentName != null) {
                addStudent(studentName);
                studentName = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addAttendance(String name, LocalDate date, Boolean att) {
        for (Student student : students) {
            if (!student.getName().equals(name)) continue;
            student.setAttendance(date, att);
        }
    }

    public List getStudentBook() {
        return students;
    }

    public List<String> getStudentPerCent() {
        List<String> res= new ArrayList<>();
        for (Student student : students) {
            res.add(student.getName() + " : " + String.format("%.0f", student.getPerCent()) + "%\n");
        }
        return res;
    }

    public List<String> getAttendanceLow25() {
        List<String> res = new ArrayList<>();
        for (Student student : students) {
            if(student.getPerCent() > 25) continue;
            res.add(student.getName() + " : " + String.format("%.0f", student.getPerCent()) + "%\n");
        }
        return res;
    }

    public List<String> getIncreasingAtt() {
        List<String> res = new ArrayList<>();
        Map<Float, String> map = new TreeMap<>();
        for (Student student : students) {
            map.put(student.getPerCent(), student.getName());
        }
        for (Map.Entry<Float, String> entry : map.entrySet()) {
            res.add(entry.getValue() + " : " + String.format("%.0f", entry.getKey()) + "%\n");
        }
        return res;
    }

    @Override
    public String toString() {
        return "" + students + '\n';
    }




}
