package FactoryMethod.California;

import FactoryMethod.Generic.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California Style Cheese Pizza";
        dough = "Very Thin Crust Dough";
        sauce = "Bruschetta Sauce";

        toppings.add("Shredded Goat Cheese");
    }
}
