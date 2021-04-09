package Chicago;

import Generic.Ingredient.Cheese.Cheese;
import Generic.Ingredient.Cheese.MozzarellaCheese;
import Generic.Ingredient.Clams.Clams;
import Generic.Ingredient.Clams.FrozenClams;
import Generic.Ingredient.Dough.Dough;
import Generic.Ingredient.Dough.ThickCrustDough;
import Generic.Ingredient.Pepperoni.Pepperoni;
import Generic.Ingredient.Pepperoni.SlicedPepperoni;
import Generic.Ingredient.Sauce.PlumTomatoSauce;
import Generic.Ingredient.Sauce.Sauce;
import Generic.Ingredient.Veggie.BlackOlives;
import Generic.Ingredient.Veggie.EggPlant;
import Generic.Ingredient.Veggie.Spinach;
import Generic.Ingredient.Veggie.Veggie;
import Generic.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() { return new ThickCrustDough(); }

    public Sauce createSauce() { return new PlumTomatoSauce(); }

    public Cheese createCheese() { return new MozzarellaCheese(); }

    public Veggie[] createVeggies() {
        return new Veggie[]{ new Spinach(), new EggPlant(), new BlackOlives()};
    }

    public Pepperoni createPepperoni() { return new SlicedPepperoni(); }

    public Clams createClams() { return new FrozenClams(); }
}
