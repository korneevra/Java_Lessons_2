package Lesson_2_5;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Presenter presenter = new Presenter(new Model_AttendanceService(), new View_AttendanceView());
        presenter.buttonClick();
    }

}
