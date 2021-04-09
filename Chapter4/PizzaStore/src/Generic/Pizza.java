package Generic;

import Generic.Ingredient.Cheese.Cheese;
import Generic.Ingredient.Clams.Clams;
import Generic.Ingredient.Dough.Dough;
import Generic.Ingredient.Pepperoni.Pepperoni;
import Generic.Ingredient.Sauce.Sauce;
import Generic.Ingredient.Veggie.Veggie;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;

    public Dough dough;
    public Sauce sauce;
    public Veggie[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;
//    public List<String> toppings = new ArrayList<String>();

    abstract public void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public String toString() {
        /// Code to print Pizza.
        return "";
    }
}
