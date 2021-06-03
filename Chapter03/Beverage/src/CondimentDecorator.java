public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public Size getSize() { return beverage.getSize(); }
    public void setSize(Size size) { beverage.setSize(size); }
    public abstract String getDescription();
}
