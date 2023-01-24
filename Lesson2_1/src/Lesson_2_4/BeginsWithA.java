package Lesson_2_4;

public class BeginsWithA implements IsGood<String> {
    @Override
    public boolean isGood(String item) {
        return ((String) item).startsWith("A");
    }
}
