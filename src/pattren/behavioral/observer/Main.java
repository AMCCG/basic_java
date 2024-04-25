package pattren.behavioral.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Observer pattern");
        // Here’s how it works:
        // Subject:
        // This is the object that holds the state and manages the list of observers
        // It provides methods to attach, detach, and notify observers.
        // Observer:
        // This is the interface that defines the method(s) that the subject calls to notify the observer of any state changes.
        // Typically, observers implement this interface.
        // Concrete Subject:
        // This is the concrete implementation of the subject interface.
        // It maintains the state and sends notifications to observers when the state changes.
        // Concrete Observer:
        // This is the concrete implementation of the observer interface.
        // It registers itself with a subject to receive notifications and implements the update method to respond to state changes.

        YoutubeChannel myChannel = new YoutubeChannel("MyChannel");
        Observer john = new YoutubeSubscriber("John");
        Observer bob = new YoutubeSubscriber("Bob");
        Observer tom = new YoutubeSubscriber("Tom");
        myChannel.addSubscriber(john);
        myChannel.addSubscriber(bob);
        myChannel.addSubscriber(tom);

        myChannel.notifyAllSubscribers(new YoutubeEvent(EventType.NEW_VIDEO, "Design patterns"));
        myChannel.removeSubscriber(tom);
        System.out.println();
        Thread.sleep(5000);
        myChannel.notifyAllSubscribers(new YoutubeEvent(EventType.LIVE_STREAM, "JAVA for beginners"));

    }
}
