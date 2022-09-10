package service;
import model.Discountable;
import model.Food;

import java.util.Arrays;

public class ShoppingCart {
   private Food[] foods;


    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalCost(){
        /*double result = 0;
        for (int i = 0; i < foods.length; i++){
            result += foods[i].getPrice();
        }
        return result;*/

        return Arrays.stream(foods).mapToDouble(Food::getPrice).sum();
    }
    public double getTotalCostDiscount(){
       /* double result = 0;
        for (int i = 0; i < foods.length; i++){
            result += foods[i].getPrice();*/
        //}

        return Arrays.stream(foods).mapToDouble(x->{
            if (x instanceof Discountable){
                return ((Discountable) x).getDiscount();
            } else {
                return x.getPrice();
            }
        }).sum();
    }
    public double getTotalCostVegetarian(){
       /* double result = 0;
        for (int i = 0; i < foods.length; i++){
            result += foods[i].getPrice();*/
        //}

        return Arrays.stream(foods).filter(food -> food.isVegetarian()).mapToDouble(Food::getPrice).sum();
    }

}


