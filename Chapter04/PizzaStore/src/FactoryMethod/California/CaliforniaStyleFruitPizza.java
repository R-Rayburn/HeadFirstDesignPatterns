package FactoryMethod.California;

import FactoryMethod.Generic.Pizza;

public class CaliforniaStyleFruitPizza extends Pizza {
    public CaliforniaStyleFruitPizza() {
        name = "California Style Fruit Pizza";
        dough = "Very Thin Crust Dough";
        sauce = "Bruschetta Sauce";

        toppings.add("Shredded Goat Cheese");
        toppings.add("Pineapple");
        toppings.add("Grapes");
    }
}
