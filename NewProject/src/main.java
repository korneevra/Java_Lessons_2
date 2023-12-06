import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main {

    public static String polynomGen(int k) {
        Random random = new Random();
        String result = "";
        while (k >= 0) {
            int ratio = random.nextInt(100);
            if (ratio != 0) {
                if (k > 1) {
                    if (result != "") result += "+";
                    result += ratio + "*x" + k;
                } else if (k == 1) {
                    if (result != "") result += "+";
                   result += ratio + "*x";
                } else {
                    if (result != "") result += "+";
                    result += ratio;
                }
            }
            k--;
        }
        return result + "=0";
    }

    public static String arrToPolynomConvert(int[] arr) {
        String result = "";
        int k = arr.length - 1;
        for (int a: arr) {
            if (a != 0) {
                if (k > 1) {
                    if (result != "") result += "+";
                    result += a + "*x" + k;
                } else if (k == 1) {
                    if (result != "") result += "+";
                   result += a + "*x";
                } else {
                    if (result != "") result += "+";
                    result += a;
                }
            }
            k--;
        }
        return result + "=0";
    }

    public static void fileCreator(String name, String data) {
        try (FileWriter fw = new FileWriter(name, false)){
            fw.write(data);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String fileReader(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(name))){
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] polynomToArr(String pn) {
        String str = pn.substring(0, pn.length() - 2);
        String[] ss= str.split("\\+");
        String delimiters = "\\+";
//        System.out.println(Arrays.toString(str.split(delimiters)));
        char c = ss[0].charAt(ss[0].length() - 1);
        int d = 0;
        if (Character.isDigit(c)) {
            d = Character.getNumericValue(c) + 1;
        } else {
            d = 2;
        }
        int[] arr = new int[d];
        for (String s: ss) {
            char degree  = s.charAt(s.length() - 1);
            if (Character.isDigit(degree) && s.contains("x")) {
                String[] k = s.split("\\*");
                arr[Math.abs(Character.getNumericValue(degree) - d + 1)] = Integer.parseInt(k[0]);
            } else if (Character.isLetter(degree)) {
                String[] k = s.split("\\*");
                arr[arr.length - 2] = Integer.parseInt(k[0]);
            } else {
                arr[arr.length - 1] = Integer.parseInt(s);
            }
        }
        return arr;
    }

    public static String polynomSummer(String pn1, String pn2) {
        String result = "";
        int[] a = polynomToArr(pn1);
        int[] b = polynomToArr(pn2);
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        result = arrToPolynomConvert(c);
        return result;
    }


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input k: ");
//        int k = scanner.nextInt();
        int k = 5;

        fileCreator("file1.txt", polynomGen(k));
        fileCreator("file2.txt", polynomGen(k));
        System.out.println(fileReader("file1.txt"));
        System.out.println(fileReader("file2.txt"));
        String s = polynomSummer(fileReader("file1.txt"), fileReader("file2.txt"));
        System.out.println(s);
        fileCreator("file3.txt", s);
    }
}
