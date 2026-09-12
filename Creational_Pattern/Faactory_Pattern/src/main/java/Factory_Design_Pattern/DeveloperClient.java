package Factory_Design_Pattern;

public class DeveloperClient {

    public static void main(String[] args) {

        System.out.println("The details of Android_Developer are:-");
        Employee employee1 = EmployeeFactory.getEmployee("Android_Developer");
        System.out.println("Salary of Android Developer is: " + employee1.salary());
        employee1.displayDetails();

        System.out.println("\n");

        System.out.println("The details of WebDeveloper are:-");
        Employee employee2 = EmployeeFactory.getEmployee("WebDeveloper");
        employee2.displayDetails();

    }
}
