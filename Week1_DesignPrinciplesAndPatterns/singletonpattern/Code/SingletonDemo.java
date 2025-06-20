package singletonpattern;

class Singleton {
    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Private constructor to prevent external instantiation
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Public static method to provide access
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();

        // Confirm both objects are same
        System.out.println("Are obj1 and obj2 same? " + (obj1 == obj2));
    }
}
