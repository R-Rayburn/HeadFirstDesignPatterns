package FactoryMethod.NY;

import FactoryMethod.Generic.Pizza;
import FactoryMethod.Generic.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese": return new NYStyleCheesePizza();
            case "pepperoni": return new NYStylePepperoniPizza();
            case "clam": return new NYStyleClamPizza();
            case "veggie": return new NYStyleVeggiePizza();
            default: return null;
        }
    }
}
