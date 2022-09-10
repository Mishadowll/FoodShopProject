package model;

import static model.constants.Discount.discounts;

public class Apple extends Food implements Discountable {

    protected String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }



   /* public double AgetDiscount() {

        var discount = discounts.get(this.getClass());
        return price * (1-discount/100);
    }*/
   /* @Override
    public double getPrice(){
       return this.price;*/
}



