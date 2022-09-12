package service;
import model.Food;



public class ShoppingCart {
    private Food[] foods;


    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalCost() {
        double result = 0;
        for (Food food : foods) {
            result += food.getPrice() * food.getAmount();
        }
        return result;
    }

    public double getTotalCostDiscount() {
        double result = 0;
        for (Food food : foods){
            result += food.getAmount() * food.getDiscount(food.getPrice());
        }
        return result;
    }

        public double getTotalCostVegetarian () {
            double result = 0;
            for (Food food : foods) {
                if (food.isVegetarian()) {
                    result += food.getPrice() * food.getAmount();
                }
            }
            return result;
        }

}




