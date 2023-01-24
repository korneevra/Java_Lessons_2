package Lesson_2_5;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class View_AttendanceView {
    Scanner scanner;

    public View_AttendanceView() {
        this.scanner = new Scanner(System.in);
    }

    public int printMenu() {
        System.out.print("1 - Add new student\n" +
                "2 - Load studentBook from db\n" +
                "3 - Add attendance to student\n" +
                "4 - View all students attendance\n" +
                "5 - View students attendance in %\n" +
                "6 - View students increasing attendance\n" +
                "7 - View students attendance below 25%\n" +
                "Input number of menu: ");
        return scanner.nextInt();
    }

    public String getName() {
        System.out.print("Input name of student: ");
        return scanner.next();
    }

    public LocalDate getDate() {
        System.out.print("Input year: ");
        int year = scanner.nextInt();
        System.out.print("Input month: ");
        int month = scanner.nextInt();
        System.out.print("Input day: ");
        int day = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }

    public boolean getAtt(){
        System.out.print("Input attendance (1/0): ");
        return scanner.nextInt() == 1;
    }

    public void print(List book) {
        System.out.println(book);
    }



}
