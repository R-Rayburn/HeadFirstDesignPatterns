package SimpleFactory.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onions");
        toppings.add("Grated parmesan cheese");
    }
}
