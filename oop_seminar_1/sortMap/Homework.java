import java.util.*;

class Homework {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<> ();
        map.put ("def", "hhfgjdghdfj");
        map.put ("abc", "hhfgjdghdfj");
        map.put ("xyz", "hhfgjdghdfj");
        map.put ("pqr", "hhfgjdghdfj");

        // переложить всё в новую коллекцию
        List<Map.Entry<String, String>> list = new ArrayList<> ();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add (entry);
        }
        list.sort (new PairComparator ());

        System.out.println(list);
    }
}
