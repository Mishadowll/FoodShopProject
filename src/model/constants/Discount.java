package model.constants;

import model.Discountable;

public class Discount implements Discountable {
   public static final double VALUE_DISCOUNT = 60.0;


   public double getDiscount(double price) {
      return price * (1 - VALUE_DISCOUNT / 100);
   }
}
