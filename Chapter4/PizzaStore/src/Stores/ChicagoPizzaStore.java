package Stores;

import Pizza.Pizza;
import Pizza.ChicagoCheesePizza;
import Pizza.ChicagoClamPizza;
import Pizza.ChicagoPepperoniPizza;
import Pizza.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese": return new ChicagoCheesePizza();
            case "pepperoni": return new ChicagoPepperoniPizza();
            case "clam": return new ChicagoClamPizza();
            case "veggie": return new ChicagoVeggiePizza();
            default: return null;
        }
    }
}
