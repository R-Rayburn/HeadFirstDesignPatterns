package FactoryMethod.California;

import FactoryMethod.Generic.Pizza;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        name = "California Style Clam Pizza";
        dough = "Very Thin Crust Dough";
        sauce = "Bruschetta Sauce";

        toppings.add("Shredded Goat Cheese");
        toppings.add("Fresh Clams");
    }
}
