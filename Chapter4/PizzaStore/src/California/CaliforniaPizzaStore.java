package California;

import Generic.PizzaStore;
import Generic.Pizza;
import California.CaliforniaCheesePizza;
import California.CaliforniaClamPizza;
import California.CaliforniaPepperoniPizza;
import California.CaliforniaVeggiePizza;

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
