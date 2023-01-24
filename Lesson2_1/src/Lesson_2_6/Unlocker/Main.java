package Lesson_2_6.Unlocker;

public class Main {


    public static void main(String[] args) {
        PinUnlock pinUnlock = new PinUnlock(123);
        FaceIDI faceID = new FaceID("456");
        FingerprintI fingerprint = new Fingerprint("789");

        pinUnlock.unlock(123);
        System.out.println("------------------");
        faceID.unlock("456");
        System.out.println("------------------");
        fingerprint.unlock("789");
    }
}
