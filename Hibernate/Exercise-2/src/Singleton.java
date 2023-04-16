public class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    public Singleton() {
    }

    // Static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (single_instance== null)
            single_instance = new Singleton();
        return single_instance;
    }
}
