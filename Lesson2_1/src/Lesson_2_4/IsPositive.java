package Lesson_2_4;

public class IsPositive implements IsGood<Integer> {


    @Override
    public boolean isGood(Integer item) {
        return (int)item >= 0;
    }
}
