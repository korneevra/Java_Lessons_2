import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class PairComparator implements Comparator<Map.Entry<String, String>> {

    @Override
    public int compare(Entry<String, String> o1, Entry<String, String> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
    
}
