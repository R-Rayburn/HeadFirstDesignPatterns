package Chicago;

import Generic.Ingredient.Cheese.MozzarellaCheese;
import Generic.Ingredient.Dough.ThickCrustDough;
import Generic.Ingredient.Sauce.PlumTomatoSauce;
import Generic.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = new ThickCrustDough();
        sauce = new PlumTomatoSauce();
        cheese = new MozzarellaCheese();
    }

    public void prepare() { }

    public void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}
