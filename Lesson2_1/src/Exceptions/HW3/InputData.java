package Exceptions.HW3;

import java.io.IOException;

public class InputData {
    String string;

    public static void input(String string) throws FileNotFoundException {
        String[] data = string.split(" ");
        try {
            if (stringTest(data))
                SaveToFile.add(data);

        } catch (IOException e) {
            throw new FileNotFoundException("File Not Found!!!");
        }
    }

    static boolean stringTest(String[] data) {
        if (data == null)
            throw new RuntimeException("Null string!");
        if (data.length != 6)
            throw new RuntimeException("Wrong number of elements!");
        if (!isLetters(data[0]))
            throw new RuntimeException("Wrong Name (not letters)");
        if (!isLetters(data[1]))
            throw new RuntimeException("Wrong Surname (not letters)");
        if (!isLetters(data[2]))
            throw new RuntimeException("Wrong MiddleName (not letters)");
        if (!isData(data[3]))
            throw new RuntimeException("Wrong format Data (dd.mm.yyyy)");
        if (!isPhoneNumber(data[4]))
            throw new RuntimeException("Wrong format PhoneNumber (min 3 digits)");
        if (!isSex(data[5]))
            throw new RuntimeException("Wrong format Sex");
        return true;
    }

    public static boolean isLetters(String string) {
        for (char ch: string.toCharArray()) {
            if (!Character.isLetter(ch)) return false;
        }
        return true;
    }

    public static boolean isPhoneNumber(String string) {
        if (string.length() < 3)
            return false;
        for (char ch: string.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
        }
        return true;
    }

    public static boolean isData(String string) {
        if (string.length() != 10)
            return false;
        char[] ch = string.toCharArray();
        if (Character.isDigit(ch[0]) & Character.isDigit(ch[1]) & ch[2] == '.' &
                Character.isDigit(ch[3]) & Character.isDigit(ch[4]) & ch[5] == '.' &
                Character.isDigit(ch[6]) & Character.isDigit(ch[7]) &
                Character.isDigit(ch[8]) & Character.isDigit(ch[9]) )
            return true;
        return false;
    }


    public static boolean isSex(String string) {
        if (string.length() != 1)
            return false;
        if (!(string.equals("f") || string.equals("m")))
            return false;
        return true;
    }
}
