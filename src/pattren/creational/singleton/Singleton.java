package pattren.creational.singleton;

public class Singleton {

    public static void main(String[] args) {
        System.out.println("Singleton");
        System.out.println("*********************************");
        var connection1 = ConnectionSingleton.getInstance();
        var connection2 = ConnectionSingleton.getInstance();
        var connection3 = ConnectionSingleton.getInstance();
        var connection4 = ConnectionSingleton.getInstance();
        System.out.println("connection1: " + connection1.getUuid());
        System.out.println("connection2: " + connection2.getUuid());
        System.out.println("connection3: " + connection3.getUuid());
        System.out.println("connection4: " + connection4.getUuid());
        System.out.println("*********************************");
    }

}
