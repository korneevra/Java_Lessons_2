package Lesson_2_5;

import java.time.LocalDate;

public class Pair<T, T1> {
    LocalDate date;
    Boolean att;

    public Pair(LocalDate date, Boolean str) {
        this.date = date;
        this.att = str;
    }

    public LocalDate getKey() {
        return this.date;
    }

    public Boolean getValue() {
        return this.att;
    }

    public void setAtt(Boolean att) {
        this.att = att;
    }

    @Override
    public String toString() {
        return "\n\t" + date + " : " + att ;
    }
}
