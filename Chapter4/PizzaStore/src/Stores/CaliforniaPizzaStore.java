package Stores;

import Pizza.Pizza;
import Pizza.CaliforniaCheesePizza;
import Pizza.CaliforniaClamPizza;
import Pizza.CaliforniaPepperoniPizza;
import Pizza.CaliforniaVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese": return new CaliforniaCheesePizza();
            case "pepperoni": return new CaliforniaPepperoniPizza();
            case "clam": return new CaliforniaClamPizza();
            case "veggie": return new CaliforniaVeggiePizza();
            default: return null;
        }
    }
}
