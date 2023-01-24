package Lesson_2_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteFileXml implements WriteFile{
    @Override
    public void writeFile(HashMap<String, Float> students, String fileName) {
        String text = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<students>\n" ;
        for (Map.Entry student: students.entrySet()){   //пробегаем по коллекции
            text += "\t<student>\n\t\t<name>" + student.getKey() + "</name>\n\t\t<grade>"
                    + student.getValue() + "</grade>\n\t</student>\n"; // преобразуем записи в формат xml
        }
        text += "</students>";

        try {
            FileWriter writer = new FileWriter(fileName + ".xml", false);
            writer.write(text); //записываем преобразованный текст в файл
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception);
        }

    }
}
