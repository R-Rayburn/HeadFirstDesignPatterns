package FactoryMethod.Chicago;

import FactoryMethod.Generic.Pizza;
import FactoryMethod.Generic.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese": return new ChicagoStyleCheesePizza();
            case "pepperoni": return new ChicagoStylePepperoniPizza();
            case "clam": return new ChicagoStyleClamPizza();
            case "veggie": return new ChicagoStyleVeggiePizza();
            default: return null;
        }
    }
}
