package service;
import model.Apple;
import model.Food;
import model.constants.Discount;
import static model.constants.Color.COLOR_RED;


public class ShoppingCart extends Discount {
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
        for (Food food : foods) {
            if (food instanceof Apple) {
                if (((Apple) food).getColor().equals(COLOR_RED)) {
                    double redAppleDiscount = this.getDiscount(food.getPrice() * food.getAmount());
                    result += redAppleDiscount;
                    continue;
                }
            }
            result += food.getPrice() * food.getAmount();
        }
        return result;
    }

    public double getTotalCostVegetarian() {
        double result = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                result += food.getPrice() * food.getAmount();
            }
        }
        return result;
    }
}




