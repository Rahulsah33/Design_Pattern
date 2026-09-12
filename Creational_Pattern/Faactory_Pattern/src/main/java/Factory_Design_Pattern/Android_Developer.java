package Factory_Design_Pattern;

public class Android_Developer implements Employee{


    @Override
    public int id() {
        return 101;
    }

    @Override
    public String name() {
        return "Alice";
    }

    @Override
    public String experience() {
        return "5 years";
    }

    @Override
    public int age() {
        return 45;
    }

    public int salary() {
        return 55000;
    }
}

