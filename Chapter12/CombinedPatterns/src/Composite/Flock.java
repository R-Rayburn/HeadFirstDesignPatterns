package Composite;

import Base.Quackable;
import Observer.Observable;
import Observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();
    List<Observable> observables = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        // Iterator Pattern!
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    public void registerObserver(Observer observer) {
        for (Quackable quacker: quackers)
            quacker.registerObserver(observer);
    }

    public void notifyObservers() {
        for (Quackable quacker: quackers)
            quacker.notifyObservers();
    }

    public String toString() {
        return "Flock of ducks.";
    }
}
