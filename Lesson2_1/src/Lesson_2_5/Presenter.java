package Lesson_2_5;

public class Presenter {
    private Model_AttendanceService attendanceService;
    private View_AttendanceView attendanceView;

    public Presenter(Model_AttendanceService attendanceService, View_AttendanceView attendanceView) {
        this.attendanceService = attendanceService;
        this.attendanceView = attendanceView;
    }

    public void buttonClick() {

        while (true) {

            int key = attendanceView.printMenu();
            switch (key) {
                case 1:
                    attendanceService.addStudent(attendanceView.getName());
                    break;
                case 2:
                    attendanceService.bookFill();
                    break;
                case 3:
                    attendanceService.addAttendance(attendanceView.getName(),
                            attendanceView.getDate(), attendanceView.getAtt());
                    break;
                case 4:
                    attendanceView.print(attendanceService.getStudentBook());
                    break;
                case 5:
                    attendanceView.print(attendanceService.getStudentPerCent());
                    break;
                case 6:
                    attendanceView.print(attendanceService.getIncreasingAtt());
                    break;
                case 7:
                    attendanceView.print(attendanceService.getAttendanceLow25());
                    break;
                default:

                    break;
            }
        }

    }



}
