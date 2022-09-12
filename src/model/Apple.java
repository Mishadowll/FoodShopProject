package model;


import static model.constants.Discount.VALUE_DISCOUNT;
import static model.constants.Color.COLOR_RED;

public class Apple extends Food implements Discountable {

    private String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    public String getColor() {

        return this.color;
    }

    @Override
    public double getDiscount(double price) {
        if (color.equals(COLOR_RED)) {
            return price * (1 - VALUE_DISCOUNT / 100);
        }
        return price;
    }
}



