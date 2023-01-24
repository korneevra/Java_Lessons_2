package Lesson_2_3;

import java.util.List;
import java.util.ListIterator;

public class GroupListIterator implements ListIterator {
    private int index;
    private Group group;

    public GroupListIterator(Group group, int index) {
        this.group = group;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index < group.getSize();
    }

    @Override
    public Student next() {
        return group.get(index++);
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Student previous() {
        return group.get(--index);
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Object o) {

    }

    @Override
    public void add(Object o) {

    }
}
