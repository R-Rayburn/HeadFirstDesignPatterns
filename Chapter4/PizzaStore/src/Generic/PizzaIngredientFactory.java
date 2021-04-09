package Generic;

import Generic.Ingredient.Cheese.Cheese;
import Generic.Ingredient.Clams.Clams;
import Generic.Ingredient.Dough.Dough;
import Generic.Ingredient.Pepperoni.Pepperoni;
import Generic.Ingredient.Sauce.Sauce;
import Generic.Ingredient.Veggie.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
