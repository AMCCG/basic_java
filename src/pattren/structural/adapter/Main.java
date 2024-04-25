package pattren.structural.adapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Adapter pattern");
        // Target is the interface expected by the client.
        // Adaptee is the class that needs to be adapted.
        // Adapter is the class that implements the Target interface and wraps the Adaptee class.
        // Client class is the class that uses the adapter to interact with the Adaptee through the Tareget interface.

        // Using the adapter to make Adaptee work with Target interface
        FriendCellPhone adaptee = new FriendCellPhone();
        CellPhone adapter = new CellPhoneAdapter(adaptee);
        adapter.call();
    }
}
