package Lesson_2_1;

public class HotDrink extends Product{
    private int temperature;
    private int volume;

    public HotDrink(String name, Float price, int cellNum, int temperature, int volume) {
        super(name, price, cellNum);
        this.temperature = temperature;
        this.volume = volume;

    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " T = " + temperature + "C, V = " + volume + "ml" ;
    }
}


