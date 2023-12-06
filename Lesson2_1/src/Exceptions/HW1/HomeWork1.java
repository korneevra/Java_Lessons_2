package Exceptions.HW1;

import java.util.Arrays;

public class HomeWork1 {


//  2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
/**    NumberFormatException, ArrayIndexOutOfBoundsException, NullPointerException   */

//  1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    static void exception1() {
        throw new RuntimeException("Exception");
    }
    static void exception2() {
        throw new NumberFormatException("Wrong number");
    }
    static void exception3() {
        throw new IndexOutOfBoundsException("Wrong Index array");
    }

//  3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//    и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
//    в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

    static int[] diffArr(int[] a, int[] b) {
        if (a == null || b == null)
            throw new RuntimeException("Null array!");
        if (a.length != b.length)
            throw new RuntimeException("Length of arrays are different!");

        int[] diff = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            diff[i] = a[i] - b[i];
        }
        return diff;
    }

//  4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.
//    Важно: При выполнении метода единственное исключение,
//    которое пользователь может увидеть - RuntimeException, т.е. ваше.

    static int[] divArr(int[] a, int[] b) {
        if (a == null || b == null)
            throw new RuntimeException("Null array!");
        if (a.length != b.length)
            throw new RuntimeException("Length of arrays are different!");

        int[] diff = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0)
                throw new RuntimeException("/ by zero!");
            diff[i] = a[i] / b[i];
        }
        return diff;
    }

    public static void main(String[] args) {
//        exception1();
//        exception2();
//        exception3();
        int[] a = {5,5,5};
        int[] b = {3,3,3};
        System.out.println(Arrays.toString(diffArr(a,b)));
        System.out.println(Arrays.toString(divArr(a,b)));

    }
}
