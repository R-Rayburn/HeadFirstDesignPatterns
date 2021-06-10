package AbstractFactory.Generic;

import AbstractFactory.Generic.Ingredient.Cheese.Cheese;
import AbstractFactory.Generic.Ingredient.Clams.Clams;
import AbstractFactory.Generic.Ingredient.Dough.Dough;
import AbstractFactory.Generic.Ingredient.Pepperoni.Pepperoni;
import AbstractFactory.Generic.Ingredient.Sauce.Sauce;
import AbstractFactory.Generic.Ingredient.Veggie.Veggie;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
