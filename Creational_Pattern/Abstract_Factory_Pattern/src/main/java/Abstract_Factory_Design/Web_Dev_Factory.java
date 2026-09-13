package Abstract_Factory_Design;

public class Web_Dev_Factory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
