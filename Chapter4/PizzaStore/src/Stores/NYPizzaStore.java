package Stores;

import Pizza.Pizza;
import Pizza.NYCheesePizza;
import Pizza.NYPepperoniPizza;
import Pizza.NYClamPizza;
import Pizza.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese": return new NYCheesePizza();
            case "pepperoni": return new NYPepperoniPizza();
            case "clam": return new NYClamPizza();
            case "veggie": return new NYVeggiePizza();
            default: return null;
        }
    }
}
