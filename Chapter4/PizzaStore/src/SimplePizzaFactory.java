import Pizza.Pizza;
import Pizza.CheesePizza;
import Pizza.ClamPizza;
import Pizza.PepperoniPizza;
import Pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }
}
