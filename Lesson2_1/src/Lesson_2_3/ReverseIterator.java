package Lesson_2_3;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {

    private int index;
    private Group group;

    public ReverseIterator(Group group) {
        this.group = group;
        this.index = group.getSize();
    }

    @Override
    public boolean hasNext() {
        return index > 0;
    }

    @Override
    public Student next() {
        return group.get(--index);
    }
}


