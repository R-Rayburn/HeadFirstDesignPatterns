package FactoryMethod.Generic;

abstract public class PizzaStore {

    abstract public Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        System.out.println("-- " + pizza.getName() + " --");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
