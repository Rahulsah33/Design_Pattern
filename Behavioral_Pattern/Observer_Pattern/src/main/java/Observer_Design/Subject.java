package Observer_Design;

public interface Subject {

    void subscribe(Observer observer);


    void unsubscribe(Observer observer);


    void update(String title);
}


