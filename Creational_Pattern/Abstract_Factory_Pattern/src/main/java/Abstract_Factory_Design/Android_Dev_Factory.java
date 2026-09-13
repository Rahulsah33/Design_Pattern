package Abstract_Factory_Design;

public class Android_Dev_Factory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {

     return new Android_Developer();
    }
}
