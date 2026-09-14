package Observer_Design;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println(" Hello " + this.name +  " new Video upload: " + title );
    }

}
