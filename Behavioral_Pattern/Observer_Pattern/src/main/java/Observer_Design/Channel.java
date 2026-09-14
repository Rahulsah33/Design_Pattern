package Observer_Design;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    private List<Observer>  subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {

        subscribers.remove(observer);

    }

    @Override
    public void update(String title) {
        for (Observer observer : subscribers) {
            observer.update(title);
        }

    }

}
