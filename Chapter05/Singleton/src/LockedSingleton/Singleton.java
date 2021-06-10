package LockedSingleton;

public class Singleton {
    // The volatile keyword ensures that multiple threads
    // handle the uniqueInstance variable correctly when it
    // is being initialized to the Singleton instance.
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        // Enter synchronized block if unique instance doesn't exist.
        if (uniqueInstance == null) {
            // Synchronize the first time through
            synchronized (Singleton.class) {
                // Create instance if still null.
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
