package Lesson_2_6.Unlocker;

public class Fingerprint  implements FingerprintI{
    private String fingerprint;

    public Fingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void unlock(String fingerprint) {
        if (fingerprint.equals(this.fingerprint)) System.out.println("Unlocked");
    }
}
