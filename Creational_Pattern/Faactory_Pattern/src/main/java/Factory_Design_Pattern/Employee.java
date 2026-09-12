package Factory_Design_Pattern;

public interface Employee {

    int id();
    String name();
    String experience();
    int age();
    int salary();



    default void displayDetails() {
        System.out.println("ID: " + id() );
        System.out.println("Name: " + name() );
        System.out.println("Experience: " + experience() );
        System.out.println("Age: " + age() );
        System.out.println("Salary: " + salary() );
    }

}
