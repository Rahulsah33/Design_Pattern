package Factory_Design_Pattern;

public class WebDeveloper implements Employee{
    @Override
    public int id() {
        return 101;
    }

    @Override
    public String name() {
        return "Bob";
    }

    @Override
    public String experience() {
        return "3 years";
    }

    @Override
    public int age() {
        return 30;
    }

    @Override
    public int salary() {
        return 44000;
    }
}
