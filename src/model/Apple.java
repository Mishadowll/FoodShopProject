package model;


public class Apple extends Food {

    private String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    }




