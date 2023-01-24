package Lesson_2_1;

public class Product {
    private static int prodID = 0;
    private String name;
    private Float price;
    private int cellNum;

    public Product(String name, Float price, int cellNum) {
        this.name = name;
        this.price = price;
        this.cellNum = cellNum;
        prodID++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getCellNum() {
        return this.cellNum;
    }

    public Float getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "[" + cellNum + "]" + " - " + price + "R;";
    }
}
