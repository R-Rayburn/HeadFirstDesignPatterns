package SimpleFactory.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin Crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated Parmesan cheese");
    }
}
