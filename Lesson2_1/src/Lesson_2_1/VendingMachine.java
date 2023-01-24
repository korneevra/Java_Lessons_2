package Lesson_2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private List <Product> products = new ArrayList<>();
    private int size;

    public VendingMachine(List<Product> products, int size) {
        this.products = products;
        this.size = size;
    }
    public VendingMachine(){};

    public void addProd(Product product) {
        this.products.add(product);
    }

    public boolean pay(Float price) {
        System.out.print("The price of product is: " + price + "R, Pay? (y/n) ");
        Scanner scanner = new Scanner(System.in);
        String pay = scanner.next();
        scanner.close();
        return pay.equals("y");
    }

    public Product getProd(int cellNum) {
        Float price = 0f;
        Product prod = null;
        for (Product product: this.products) {
            if (product.getCellNum() != cellNum) {
                continue;
            } else {
                price = product.getPrice();
                prod = product;
            }
        }
        return pay(price) ? prod : null;
    }
}
