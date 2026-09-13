package Abstract_Factory_Design;

public class EmployeeFactory {

    // get Employee

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();

    }
}
