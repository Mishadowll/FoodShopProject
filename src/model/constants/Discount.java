package model.constants;

import model.Apple;
import model.Discountable;

import java.util.Map;

public class Discount {
    int valueDiscount;
    public static final Map<Class<?extends Discountable>,Integer>discounts=Map.of(Apple.class, 60);





    /*
    public Discount (int valueDiscount){
        this.valueDiscount = valueDiscount;
    }

    public double calculatePrice(double price){
        return price * (1-100/valueDiscount);
    }*/
}
