package Exceptions.HW2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class HomeWork2 {

//    Задание 1.
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.

    static float inputNumber(){
        float res = 0;
        Boolean flag;
        String s = "";
        do {
            flag = false;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number:>_");
            try {
                res = scanner.nextFloat();
            } catch (InputMismatchException e) {
                s = e.getClass().getSimpleName();
                if (s.equals("InputMismatchException")) {
                    System.out.println("Wrong Float!!!");
                    flag = true;
                } else flag = false;
            }
        } while (flag);
        return res;
    }
    

    public static void main(String[] args) throws Exception {
        System.out.println(inputNumber());
        System.out.println(inputString());


//    Задание 2
        int[] intArray = {1, 2, 3};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } catch (Exception e) {
            System.out.println("Какое-то исключение!)");
        }

//        Задание 3
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 123);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Арифметическое исключение (/0)");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception e) {
            System.out.println("Какое-то исключение!");
        }
    }
        public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
        }


//    Задание 4.
//    Разработайте программу, которая выбросит Exception,
//    когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    static String inputString(){
        String res = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string:>_");
        res = scanner.nextLine();
        if (res.equals(""))
            throw new RuntimeException("You're can't input empty string!");
        return res;
    }
}
