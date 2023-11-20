package model;

public abstract class Food {
    private int amount;
    private double price;
    public boolean isVegetarian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    protected void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public double getDiscount() {
        return 0;
    }
}