package Lesson_2_2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
    Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию
    о студентах в разных формах:
    Просто текст:
    Иван Иванов=4.8
    Мария Кузнецова=5.0
    Степан Кузьмин=3.6

    JSON:
    {
    "Иван Иванов": 4.8,
    "Мария Кузнецова": 5.0,
    "Степан Кузьмин": 3.6
    }

    XML:
    <?xml version="1.0" encoding="utf-8" ?>
    <students>
        <student>
          <name>Иван Иванов</name>
          <grade>4.8</grade>
        </student>
        <student>
            <name>Мария Кузнецова</name>
            <grade>5.0</grade>
        </student>
        <student>
            <name>Степан Кузьмин</name>
            <grade>3.6</grade>
        </student>
    </students>
     */

    public static void main (String[] args) {
        HashMap<String, Float> students = new HashMap<String, Float>(); //инициализация коллекции студентов
        students.put("Ivan Ivanov", 4.8f);      // заполнение коллекции
        students.put("Maria Kuznetsova", 5.0f);
        students.put("Stepan Kuzmin", 3.6f);

        WriteFile wft = new WriteFileTxt(); //создание эеземпляра класса записи в тхт
        wft.writeFile(students, "Students"); // запись коллекции студентов в тхт файл
        // аналогично json
        WriteFile wfj = new WriteFileJson();
        wfj.writeFile(students, "Students");
        // аналогично xml
        WriteFile wfx = new WriteFileXml();
        wfx.writeFile(students, "Students");

    }
}
