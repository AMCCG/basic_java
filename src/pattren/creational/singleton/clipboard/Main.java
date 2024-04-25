package pattren.creational.singleton.clipboard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton");
        System.out.println("*********************************");
        Clipboard clipboard1 = new Clipboard();
        Clipboard clipboard2 = new Clipboard();
        clipboard1.copy("Java");
        clipboard2.copy("Design patterns");

        System.out.println(clipboard1.paste()); // output: Java
        System.out.println(clipboard2.paste()); // output: Design patterns
        System.out.println("*********************************");
        System.out.println("*********************************");
        // Getting the singleton instances
        SingletonClipboard singletonClipboard1 = SingletonClipboard.getInstance();
        SingletonClipboard singletonClipboard2 = SingletonClipboard.getInstance();
        singletonClipboard1.copy("Java");
        singletonClipboard2.copy("Design patterns");

        System.out.println(singletonClipboard1.paste()); // output: Design patterns
        System.out.println(singletonClipboard2.paste()); // output: Design patterns
        System.out.println("*********************************");
    }

}
