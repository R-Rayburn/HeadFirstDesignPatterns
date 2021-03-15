public abstract class Beverage {
    public String description = "Unknown Beverage";
//    private boolean milk;
//    private boolean soy;
//    private boolean mocha;
//    private boolean whip;

    public String getDescription() { return description; }
    public abstract double cost();

//    public boolean hasMilk() { return milk; }
//    public void setMilk(boolean milk) { this.milk = milk; }
//    public boolean hasSoy() { return soy; }
//    public void setSoy(boolean soy) { this.soy = soy; }
//    public boolean hasMocha() { return mocha; }
//    public void setMocha(boolean mocha) { this.mocha = mocha; }
//    public boolean hasWhip() { return whip; }
//    public void setWhip(boolean whip) { this.whip = whip; }
}
