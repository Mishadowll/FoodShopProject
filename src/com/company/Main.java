package com.company;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Color;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        Food meat = new Meat(5,100);
        Apple appleRed = new Apple(10,50, Color.COLOR_GREEN);
        Apple appleGreen = new Apple(8,60,Color.COLOR_RED);

        Food[] foods = new Food[]{meat, appleGreen, appleRed};

        System.out.println(appleGreen.getDiscount());
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println(cart.getTotalCost());
        System.out.println(cart.getTotalCostDiscount());
        System.out.println(cart.getTotalCostVegetarian());






    }
}
