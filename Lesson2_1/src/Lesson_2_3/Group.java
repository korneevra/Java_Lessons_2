package Lesson_2_3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Group implements Iterable {
    List<Student> stdents;

    public Group(List<Student> stdents) {
        this.stdents = stdents;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(this);
    }
    public ListIterator<Student> listIterator(int index) {
        return new GroupListIterator(this, index);
    }
    public Iterator<Student> reverseIterator() {
        return new ReverseIterator(this);
    }

    public int getSize() {
        return this.stdents.size();
    }

    public Student get(int index) {
        return stdents.get(index);
    }
}
