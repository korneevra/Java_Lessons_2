package Lesson_2_4;

import java.util.*;

public class Main {

    /*
    Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
    boolean isGood (T item);
    Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
    Создайте следующие детские классы:
    • IsEven — ему дают целое число, он одобряет его, если оно чётное
    • IsPositive — ему дают целое число, он одобряет его, если оно положительное
    • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
    • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

    Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
    Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
    Продемонстрируйте, что это работает.
     */

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap();
        students.put("Ivanov", 5);
        students.put("Petrov", 4);
        students.put("Sidorov", -3);

        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9, -10);

        List<String> list2 = Arrays.asList("5", "Alslsl", "aioioi", "A12345", "aio45th67");

        System.out.println(filter(list, new IsEven()));
        System.out.println(filter(list, new IsPositive()));

        System.out.println(filter(students, new IsEven()));
        System.out.println(filter(students, new IsPositive()));

        System.out.println(filter(list2, new BeginsWithA()));
        System.out.println(filter(list2, new BeginsWith("aio")));
    }

    public static <T> Iterable<T> filter (Iterable<T> collection, IsGood<T> approver) {
        List<T> newList = new ArrayList<>();
        for(T o: collection) {
            if (approver.isGood(o)) newList.add(o);
        }
        return newList;
    }
    
    public static <T1, T> Map<T1, T> filter (Map<T1, T> collection, IsGood<T> approver) {
        Map<T1, T> newmap = new HashMap<>();
        for(Map.Entry<T1, T> entry: collection.entrySet()) {
            if (approver.isGood(entry.getValue())) newmap.put(entry.getKey(), entry.getValue());
        }
        return newmap;
    }
}
