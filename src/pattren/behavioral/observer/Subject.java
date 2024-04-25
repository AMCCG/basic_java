package pattren.behavioral.observer;

public interface Subject {
    void addSubscriber(Observer observer);

    void removeSubscriber(Observer observer);

    void notifyAllSubscribers(YoutubeEvent event);
}
