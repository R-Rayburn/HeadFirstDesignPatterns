package GeneralSingleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() { }

    // Using Synchronized to force threads to enter one at a time.
    // Removing synchronized will create a "classic" singleton. This
    //  "classic" singleton is not thread save.
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
