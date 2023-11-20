package model.constants;

import model.Food;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        setVegetarian(true);
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return 0.6;
        } else {
            return 0;
        }
    }
}
