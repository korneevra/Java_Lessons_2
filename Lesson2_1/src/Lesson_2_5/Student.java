package Lesson_2_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Pair<String, Boolean>> attendance;

    public Student(String name) {
        this.name = name;
        this.attendance = new ArrayList<>();
    }

    public void setAttendance(LocalDate date, Boolean att) {
        this.attendance.add(new Pair<>(date, att));
    }

    public void editAttendance(LocalDate date, Boolean att) {
        for (Pair pair : attendance) {
            if (!pair.getKey().equals(date)) continue;
            pair.setAtt(att);
        }
    }

    public String getName() {
        return name;
    }

    public float getPerCent() {
        float res = 0;
        float count = 0;
        for (Pair pair: attendance) {
            if(pair.getValue()) res ++;
            count++;
        }
        return (res / count * 100);
    }

    @Override
    public String toString() {
        return "\n" + name + attendance;
    }

}
