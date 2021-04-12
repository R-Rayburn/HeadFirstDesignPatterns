package FactoryMethod.California;

import FactoryMethod.Generic.Pizza;
import FactoryMethod.Generic.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese": return new CaliforniaStyleCheesePizza();
            case "pepperoni": return new CaliforniaStylePepperoniPizza();
            case "clam": return new CaliforniaStyleClamPizza();
            case "fruit": return new CaliforniaStyleFruitPizza();
            default: return null;
        }
    }
}