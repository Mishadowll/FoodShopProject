package model;

import static model.constants.Discount.discounts;

public interface Discountable {
   default double getDiscount(){
       var discount = discounts.get(this.getClass());
       return getPrice() * (1-discount/100f);
   }
   double getPrice();
}
