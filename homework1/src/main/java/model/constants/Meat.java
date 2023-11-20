package model.constants;
import model.Food;

public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price);
        setVegetarian(false);
    }
}