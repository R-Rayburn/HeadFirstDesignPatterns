package AbstractFactory.Client.NY;

import AbstractFactory.Generic.Ingredient.Cheese.Cheese;
import AbstractFactory.Generic.Ingredient.Cheese.ReggianoCheese;
import AbstractFactory.Generic.Ingredient.Clams.Clams;
import AbstractFactory.Generic.Ingredient.Clams.FreshClams;
import AbstractFactory.Generic.Ingredient.Dough.Dough;
import AbstractFactory.Generic.Ingredient.Dough.ThinCrustDough;
import AbstractFactory.Generic.Ingredient.Pepperoni.Pepperoni;
import AbstractFactory.Generic.Ingredient.Pepperoni.SlicedPepperoni;
import AbstractFactory.Generic.Ingredient.Sauce.MarinaraSauce;
import AbstractFactory.Generic.Ingredient.Sauce.Sauce;
import AbstractFactory.Generic.Ingredient.Veggie.*;
import AbstractFactory.Generic.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggie[] createVeggies() {
        return new Veggie[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
