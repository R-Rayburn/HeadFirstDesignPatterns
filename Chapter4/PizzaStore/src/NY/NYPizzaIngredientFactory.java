package NY;

import Generic.Ingredient.Cheese.Cheese;
import Generic.Ingredient.Cheese.ReggianoCheese;
import Generic.Ingredient.Clams.Clams;
import Generic.Ingredient.Clams.FreshClams;
import Generic.Ingredient.Dough.Dough;
import Generic.Ingredient.Dough.ThinCrustDough;
import Generic.Ingredient.Pepperoni.Pepperoni;
import Generic.Ingredient.Pepperoni.SlicedPepperoni;
import Generic.Ingredient.Sauce.MarinaraSauce;
import Generic.Ingredient.Sauce.Sauce;
import Generic.Ingredient.Veggie.*;
import Generic.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() { return new ThinCrustDough(); }

    public Sauce createSauce() { return new MarinaraSauce(); }

    public Cheese createCheese() { return new ReggianoCheese(); }

    public Veggie[] createVeggies() {
        return new Veggie[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    public Pepperoni createPepperoni() { return new SlicedPepperoni(); }

    public Clams createClams() { return new FreshClams(); }
}
