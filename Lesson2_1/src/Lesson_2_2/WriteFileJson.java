package Lesson_2_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteFileJson implements WriteFile{
    @Override
    public void writeFile(HashMap<String, Float> students, String fileName) {
        String text = "{\n";
        for (Map.Entry student: students.entrySet()){   //пробегаем по коллекции
            text += "\t\"" + student.getKey() + "\": " + student.getValue() + ",\n";  // преобразуем записи в формат json
        }
        text = text.substring(0, text.length() - 2);
        text += "\n}";

        try {
            FileWriter writer = new FileWriter(fileName + ".json", false);
            writer.write(text); //записываем преобразованный текст в файл
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception);
        }

    }
}
