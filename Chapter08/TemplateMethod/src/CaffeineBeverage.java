public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    // Primitive operations
    abstract void brew();
    abstract void addCondiments();

    // Concrete operations
    public void boilWater() { System.out.println("Boiling water"); }
    public void pourInCup() { System.out.println("Pouring into cup"); }

    // Hook
    public boolean customerWantsCondiments() {
        return false;
    }
}
