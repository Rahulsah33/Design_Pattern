package Factory_Design_Pattern;

public class EmployeeFactory {

    public static Employee getEmployee(String emptype){

        if (emptype.trim().equalsIgnoreCase("Android_Developer")){
            return new Android_Developer();
        }
        else if (emptype.trim().equalsIgnoreCase("WebDeveloper")){
            return new WebDeveloper();
        }
        else{
            throw new IllegalArgumentException("No such employee exists");
        }

    }
}
