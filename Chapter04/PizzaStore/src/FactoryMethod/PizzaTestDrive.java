package FactoryMethod;

import FactoryMethod.California.CaliforniaPizzaStore;
import FactoryMethod.Chicago.ChicagoPizzaStore;
import FactoryMethod.Generic.Pizza;
import FactoryMethod.Generic.PizzaStore;
import FactoryMethod.NY.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Edward ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Al ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Edward ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Al ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Edward ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Al ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Edward ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Al ordered a " + pizza.getName() + "\n");

        PizzaStore californiaStore = new CaliforniaPizzaStore();
        pizza = californiaStore.orderPizza("fruit");
        System.out.println("Edward bravely ordered a " + pizza.getName());
        System.out.println("Good luck!\n");
    }
}
