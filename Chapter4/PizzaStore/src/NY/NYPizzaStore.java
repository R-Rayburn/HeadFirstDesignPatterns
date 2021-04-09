package NY;

import Generic.PizzaStore;
import Generic.Pizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese": return new NYCheesePizza();
            case "pepperoni": return new NYPepperoniPizza();
            case "clam": return new NYClamPizza();
            case "veggie": return new NYVeggiePizza();
            default: return null;
        }
    }
}
