package model;


import model.constants.Apple;
import model.constants.Meat;

import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;


public class Main {
    public static void main(String[] args) {
       Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, RED);
        Apple greenApples = new Apple(8, 60, GREEN);

        Food[] items = {meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(items);

        double totalWithoutDiscount = cart.getTotalPriceWithoutDiscount();
        double totalWithDiscount = cart.getTotalPriceWithDiscount();
        double totalVegetarianWithoutDiscount = cart.getTotalVegetarianPriceWithoutDiscount();

        System.out.println("Общая цена без скидки: " + totalWithoutDiscount);
        System.out.println("Общая цена со скидкой: " + totalWithDiscount);
        System.out.println("Общая стоимость вегетарианских блюд без скидки: " + totalVegetarianWithoutDiscount);
    }
}