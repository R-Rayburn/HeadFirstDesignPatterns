package AbstractFactory.Generic.Pizza;

import AbstractFactory.Generic.Ingredient.Cheese.Cheese;
import AbstractFactory.Generic.Ingredient.Clams.Clams;
import AbstractFactory.Generic.Ingredient.Dough.Dough;
import AbstractFactory.Generic.Ingredient.Pepperoni.Pepperoni;
import AbstractFactory.Generic.Ingredient.Sauce.Sauce;
import AbstractFactory.Generic.Ingredient.Veggie.Veggie;

abstract public class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggie[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    abstract public void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal pieces");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("--- ").append(name).append(" ---\n");
        if (dough != null) {
            description.append(dough).append("\n");
        }
        if (sauce != null) {
            description.append(sauce).append("\n");
        }
        if (cheese != null) {
            description.append(cheese).append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                description.append(veggies[i]);
                if (i < veggies.length-1) {
                    description.append(", ");
                } else {
                    description.append("\n");
                }
            }
        }
        if (clams != null) {
            description.append(clams).append("\n");
        }
        if (pepperoni != null) {
            description.append(pepperoni).append("\n");
        }
        return description.toString();
    }
}
