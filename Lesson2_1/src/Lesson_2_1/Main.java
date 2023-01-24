package Lesson_2_1;

import java.util.*;

public class Main {

    public static void main (String[] args) {

        /*
        Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
        При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
        Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
        Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод
        getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
        В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.
         */

//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Choco", 50.45f, 1));
//        products.add(new Product("Chips", 82.75f, 2));
//        products.add(new Product("Cookies", 40.25f, 3));
//
//        VendingMachine vendingMachine = new VendingMachine(products, 50);
//        System.out.print("Enter number of Product: ");
//        Scanner scanner = new Scanner(System.in);
//        int cellNum = scanner.nextInt();
//        System.out.println(vendingMachine.getProd(cellNum));

        List<HotDrink> drinks = new ArrayList<>();
        drinks.add(new HotDrink("Coffee", 50f, 1, 85, 200));
        drinks.add(new HotDrink("Tee", 40f, 2, 75, 200));
        drinks.add(new HotDrink("Cacao", 45f, 3, 80, 200));

        HotVendingMachine hotVendingMachine = new HotVendingMachine(drinks, 10);

        System.out.print("Enter number of Drink: ");
        Scanner scanner = new Scanner(System.in);
        int cellNum = scanner.nextInt();
        System.out.print("Enter temperature of Drink: ");
        int temp = scanner.nextInt();
        System.out.print("Enter volume of Drink: ");
        int vol = scanner.nextInt();

        System.out.println(hotVendingMachine.getProd(cellNum, vol, temp));
        scanner.close();



    }
}
