import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        for(int i=0;i<1000;i++){
            employeeList.add(new Employee(i,"i"+i,"desc"+i));
        }
        return employeeList;
    }
}
