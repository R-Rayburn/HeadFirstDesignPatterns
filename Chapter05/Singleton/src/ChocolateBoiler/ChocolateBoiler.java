package ChocolateBoiler;

// This will cause issues, due to multiple threads running the getInstance at the same time.
// To resolve, we should follow one of the examples in the *Singleton packages (although the
// double-checked locking version might be overkill, and requires JAVA 5+).
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler singleInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (singleInstance == null) {
            singleInstance = new ChocolateBoiler();
        }
        return singleInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the boiler
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiler
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring contents to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
