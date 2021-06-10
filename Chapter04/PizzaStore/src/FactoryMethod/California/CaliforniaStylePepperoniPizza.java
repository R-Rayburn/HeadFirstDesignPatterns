package FactoryMethod.California;

import FactoryMethod.Generic.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        name = "California Style Pepperoni Pizza";
        dough = "Very Thin Crust Dough";
        sauce = "Bruschetta Sauce";

        toppings.add("Shredded Goat Cheese");
        toppings.add("Spicy Sliced Pepperoni");
    }
}
