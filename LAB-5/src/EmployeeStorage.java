import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage implements Storage  {
    List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) throws EmployeeAlreadyExistsException {
        for (Employee employee1 : employees) {
            if (employee1.getId() == employee.getId()) {
                throw new EmployeeAlreadyExistsException("employee");
            }
        }
        employees.add(employee);
    }

    @Override
    public Employee getEmployee(int empno) throws EmployeeNotFoundException {
        for(Employee employee : employees) {
            if(employee.getId() == empno) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("The requested employee is not found!");
    }

    public static void main(String[] args) {
        Storage storage = new EmployeeStorage();
        try {
            Employee employee3 = new Employee(1, "Varshi");
            storage.addEmployee(employee3);

            Employee employee4 = new Employee(2, "Likki");
            storage.addEmployee(employee4);

            storage.addEmployee(employee3);
        }
        catch (EmployeeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
