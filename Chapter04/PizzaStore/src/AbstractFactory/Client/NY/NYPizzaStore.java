package AbstractFactory.Client.NY;

import AbstractFactory.Generic.Pizza.*;
import AbstractFactory.Generic.PizzaIngredientFactory;
import AbstractFactory.Generic.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        String baseName = "New York Style";

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName(baseName + " Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName(baseName + " Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName(baseName + " Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName(baseName + " Veggie Pizza");
                break;
        }

        return pizza;
    }
}
