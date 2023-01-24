package Lesson_2_6.Unlocker;

public class Del_Presenter {
    FaceIDI faceIDI;
    Fingerprint fingerprint;
    PinUnlock pinUnlock;
    Del_UI ui;

    public Del_Presenter(FaceIDI faceIDI, Fingerprint fingerprint, PinUnlock pinUnlock, Del_UI ui) {
        this.faceIDI = faceIDI;
        this.fingerprint = fingerprint;
        this.pinUnlock = pinUnlock;
        this.ui = ui;
    }

//    public void unlock () {
//        int t = ui.unlock();
//        switch () {
//            case 1:
//                pinUnlock.unlock();
//        }
//    }
}
