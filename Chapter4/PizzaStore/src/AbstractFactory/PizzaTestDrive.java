package AbstractFactory;

import AbstractFactory.Client.NY.NYPizzaStore;
import AbstractFactory.Generic.Pizza.Pizza;
import AbstractFactory.Generic.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Edward ordered:\n" + pizza);
    }
}
