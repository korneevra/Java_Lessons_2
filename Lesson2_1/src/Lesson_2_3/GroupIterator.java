package Lesson_2_3;

import java.util.Iterator;

public class GroupIterator implements Iterator<Student> {

    private int index = 0;
    private Group group;

    public GroupIterator(Group group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return index < group.getSize();
    }

    @Override
    public Student next() {
        return group.get(index++);
    }
}
