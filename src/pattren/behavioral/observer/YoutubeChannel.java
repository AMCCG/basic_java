package pattren.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    private final String name;
    private final List<Observer> subscribers = new ArrayList<>();

    public YoutubeChannel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyAllSubscribers(YoutubeEvent event) {
        for (Observer subscriber : subscribers) {
            subscriber.notifyMe(getName(), event);
        }
    }
}
