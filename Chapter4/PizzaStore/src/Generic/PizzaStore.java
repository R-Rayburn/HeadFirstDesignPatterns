package Generic;

public abstract class PizzaStore {
    // * Note that the orderPizza() method in the superclass
    // has no clue which Pizza we are creating; it just knows
    // it can prepare, bake, cut, and box it!
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
