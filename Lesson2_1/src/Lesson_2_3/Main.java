package Lesson_2_3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    /*
    Класс Группа содержит в себе коллекцию Студентов.
    По группе можно перемещаться с помощью итератора.
    (Это повторяет 1-ю задачу из классной работы).
    Остальные задачи надстраиваются поверх неё.

    Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
    Он реализует интерфейс ListIterator<Student>.
    Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

    Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
    • Он отслеживает текущую позицию в переборе
    • Он изначально выставлен на конечную позицию
    • Он движется справа налево
    Проверьте, как он работает.
     */

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivanov", 4.8f),
                new Student("Petrov", 3.7f),
                new Student("Sidorov", 4.5f));
        Group group = new Group(students);

        for (Object student: group) {
            System.out.println(student);
        }

        System.out.println("---Iterator----");
        Iterator<Student> iterator = group.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----ListIterator----");
        ListIterator<Student> listIterator = group.listIterator(0);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("---ListIterator rev---");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("----ReversIterator----");
        Iterator<Student> revIt = group.reverseIterator();
        while (revIt.hasNext()) {
            System.out.println(revIt.next());
        }
    }
}
