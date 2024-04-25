package pattren.creational.singleton.clipboard;

public class Clipboard {
    private String value;

    public void copy(String value) {
        this.value = value;
    }

    public String paste() {
        return value;
    }
}
