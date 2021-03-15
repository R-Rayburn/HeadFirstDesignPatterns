public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public Size getSize() { return beverage.getSize(); }
    public abstract String getDescription();
}
