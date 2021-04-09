package Chicago;

import Generic.PizzaStore;
import Generic.Pizza;

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
