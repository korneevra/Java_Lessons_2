package Exceptions.HW3;

import java.io.IOException;

public class FileNotFoundException extends IOException {

    public FileNotFoundException(String massage) {
        super(massage);
    }
}
