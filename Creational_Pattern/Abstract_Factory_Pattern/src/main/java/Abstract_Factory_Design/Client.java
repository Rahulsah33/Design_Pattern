package Abstract_Factory_Design;

public class Client {

    public static void main(String[] args) {

       Employee e1 = EmployeeFactory.getEmployee(new Android_Dev_Factory());
        System.out.println("Name: " + e1.name());
       System.out.println("Salary: " + e1.salary());

    }
}
