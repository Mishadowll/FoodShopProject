package model;

public abstract class Food {
    private int amount;
    protected double price;
    private boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getPrice() {

        return price;
    }

    /*public void setPrice(double price) {

        this.price = price;
    }*/
    public boolean isVegetarian() {

        return isVegetarian;
    }

}
