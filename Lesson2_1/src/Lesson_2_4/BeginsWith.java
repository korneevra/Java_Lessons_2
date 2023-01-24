package Lesson_2_4;

public class BeginsWith implements IsGood<String> {
    private final String string;

    public BeginsWith(String string) {
        this.string = string;
    }

    @Override
    public boolean isGood(String item) {
        return ((String) item).startsWith(string);
    }
}
