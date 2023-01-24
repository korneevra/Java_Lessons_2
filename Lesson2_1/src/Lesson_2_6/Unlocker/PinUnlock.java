package Lesson_2_6.Unlocker;

public class PinUnlock implements PinUnlockI {
    private int pin;

    public PinUnlock(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlock(int pin) {
        if (pin == this.pin) System.out.println("Unlocked");
    }

}
