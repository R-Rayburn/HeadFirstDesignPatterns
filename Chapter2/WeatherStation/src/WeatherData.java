import Observer.Observer;
import Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) { observers.remove(o); }

    public void notifyObservers() {
        int increment = 1;
        for (Observer observer : observers) {
            System.out.print(increment + ": ");
            observer.update();
            increment ++;
        }
    }

    public void measurementsChanged() {
        System.out.println("---- Values Updated ----");
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() { return this.temperature; }
    public float getHumidity() { return this.humidity; }
    public float getPressure() { return this.pressure; }
}
