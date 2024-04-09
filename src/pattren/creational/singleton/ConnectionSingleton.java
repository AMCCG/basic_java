package pattren.creational.singleton;

import java.util.UUID;

public class ConnectionSingleton {
    private static ConnectionSingleton instance;

    private String uuid;

    private ConnectionSingleton() {
        System.out.println("Create ConnectionSingleton");
        this.uuid = UUID.randomUUID().toString();
    }

    public static ConnectionSingleton getInstance() {
        if (ConnectionSingleton.instance == null) {
            System.out.println("instance is null");
            ConnectionSingleton.instance = new ConnectionSingleton();
        } else {
            System.out.println("instance is already create");
        }
        return ConnectionSingleton.instance;
    }

    public String getUuid() {
        return uuid;
    }

}
