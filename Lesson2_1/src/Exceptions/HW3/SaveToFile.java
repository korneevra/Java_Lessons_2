package Exceptions.HW3;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {

    public SaveToFile() {
    }

    public static void add(String[] arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter(arr[0], true)) {
            fileWriter.write("<" + arr[0] + ">" +
                                "<" + arr[1] + ">" +
                                "<" + arr[2] + ">" +
                                "<" + arr[3] + ">" +
                                "<" + arr[4] + ">" +
                                "<" + arr[5] + ">"+"\n");
        }
    }
}
