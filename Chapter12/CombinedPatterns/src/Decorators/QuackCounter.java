package Decorators;

import Base.Quackable;
import Observer.Observable;
import Observer.Observer;

public class QuackCounter implements Quackable {
    Quackable duck;
    Observable observable;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuacks() { return numberOfQuacks; }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public String toString() {
        return duck.toString();
    }
}
