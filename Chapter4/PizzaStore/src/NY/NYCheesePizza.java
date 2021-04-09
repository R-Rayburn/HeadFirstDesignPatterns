package NY;

import Generic.Ingredient.Cheese.ReggianoCheese;
import Generic.Ingredient.Dough.ThinCrustDough;
import Generic.Ingredient.Sauce.MarinaraSauce;
import Generic.Pizza;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();
        cheese = new ReggianoCheese();
    }

    public void prepare() { }
}
