package Lesson_2_4;

public class IsEven implements IsGood<Integer> {


    @Override
    public boolean isGood(Integer item) {
        return (int) item % 2 == 0;
    }
}
