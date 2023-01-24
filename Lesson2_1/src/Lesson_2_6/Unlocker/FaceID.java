package Lesson_2_6.Unlocker;

public class FaceID implements FaceIDI{
    private String faceID;

    public FaceID(String faceID) {
        this.faceID = faceID;
    }


    @Override
    public void unlock(String faceID) {
        if(faceID.equals(this.faceID)) System.out.println("Unlocked");
    }
}
