package Lesson_2_2;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteFileTxt implements WriteFile{
    @Override
    public void writeFile(HashMap<String, Float> students, String fileName) {
        String text = "";
        for (Map.Entry student: students.entrySet()){   //пробегаем по коллекции
            text += student.getKey() + "=" + student.getValue() + "\n"; // преобразуем записи в текстовый формат
        }

        try {
            FileWriter writer = new FileWriter(fileName + ".txt", false);
            writer.write(text); //записываем преобразованный текст в файл
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}
