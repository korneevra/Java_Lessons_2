package Lesson_2_1;

import java.util.ArrayList;
import java.util.List;

public class HotVendingMachine extends VendingMachine{
    private List<HotDrink> drinks = new ArrayList<>();

    public HotVendingMachine(List<HotDrink> drinks, int size) {
        super();
        this.drinks = drinks;

    }

    public HotDrink getProd(int cellNum, int vol, int temp) {
        Float price = 0f;
        HotDrink dr = null;
        for (HotDrink drink: drinks) {
            if (drink.getCellNum() != cellNum) {
                continue;
            } else {
                price = drink.getPrice();
                dr = drink;
            }
        }
        dr.setTemperature(temp);
        dr.setVolume(vol);
        return pay(price) ? dr : null;
    }
}
