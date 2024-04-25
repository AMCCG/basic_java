package pattren.creational.singleton.clipboard;

public class SingletonClipboard {

    private static SingletonClipboard singletonClipboard = null;
    private String value;

    private SingletonClipboard() {
        // Private constructor to prevent instantiation from outside
    }

    public static SingletonClipboard getInstance() {
        if (singletonClipboard == null) {
            singletonClipboard = new SingletonClipboard();
        }
        return singletonClipboard;
    }

    public void copy(String value) {
        this.value = value;
    }

    public String paste() {
        return value;
    }
}
