import java.util.*;

public class Filter {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<Laptop> ();
        laptops.add (new Laptop ("DELL", "763456743"));
        laptops.add (new Laptop ("Acer", "657485"));
        laptops.add (new Laptop ("Lenova", "SDBFBDFS"));
        laptops.add (new Laptop ("Acer", "657411"));
        laptops.add (new Laptop ("Acer", "657496"));
        laptops.add (new Laptop ("IBM", "DFDSS"));

        String producer = "Acer";

        // Оставить только ноутбуки Acer
        List<Laptop> filtered = new ArrayList<> ();
        for (Laptop laptop : laptops) {
            if (!laptop.getProducer().equals(producer))  // пропустить, если неправильный производитель
                continue;
            if (!laptop.getModel().startsWith("6"))  // пропустить, если неправильная модель
                continue;

            filtered.add (laptop);
        }

        System.out.println(filtered);
    }
}
