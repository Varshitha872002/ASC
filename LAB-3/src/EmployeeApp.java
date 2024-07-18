import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
    // Test the application by creating instances of the UserUI class and calling its methods.
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display employee by empNo");
            System.out.println("3. exit");
            System.out.println("Choose option: ");
            int option = s.nextInt();
            switch (option) {
                case 101:
                    userUI.acceptEmpDetailsAndStore();
                    break;
                case 102:
                    userUI.displayEmpByEmpno();
                    break;
                case 103:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option");
            }
        }
    }
}

// create the employee class and enter the details of the employee
class Employee {
    int empNo;
    String first_name;
    String last_name;
    String city;
    double salary;

    //declare the attributes in the getters and setters method

    public Employee(int empNo, String first_name, String last_name, String city, double salary) {
        this.empNo = empNo;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getFirstname() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + "empno- " + empNo + ", firstname- " + first_name + ", lastname- " + last_name + ", city- " + city + ", salary- " + salary;
    }
}

// Storage Interface
//Define the methods for adding and retrieving employees.
interface Storage {
    void addEmployee(Employee e);
    Employee getEmployee(int empNo);
}

// StorageImpl Class
//Implement the Storage Interface in the StorageImpl Class:
//Create an array to store employee objects and implement
// the methods for adding and retrieving employees.
class StorageImpl implements Storage {
    private ArrayList<Employee> employees;

    public StorageImpl() {
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public Employee getEmployee(int empNo) {
        for (Employee e : employees) {
            if (e.getEmpNo() == empNo) {
                return e;
            }
        }
        return null;
    }
}

//StorageFactory class
//Create the StorageFactory Class
//Implement a method to return an instance of the StorageImpl class.
class StorageFactory {
    public static Storage getStorage() {
        return new StorageImpl();
    }
}

//UserUI class
//Create the UserUI Class:
//Implement methods to accept employee details and store them,
// and to display employee details by employee number.
// This class will use StorageFactory to get a Storage implementation.
class UserUI {
    private Storage storage;
    public UserUI() {
        storage = StorageFactory.getStorage();
    }

    public void acceptEmpDetailsAndStore() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee no:");
        int empNo = s.nextInt();
        s.nextLine(); // it will adds the next line
        System.out.println("Enter first name:");
        String first_name = s.nextLine();
        System.out.println("enter last name");
        String last_name = s.nextLine();
        System.out.println("enter city");
        String city = s.nextLine();
        System.out.println("enter salary");
        double salary = s.nextDouble();

        Employee employee = new Employee(empNo, first_name, last_name, city, salary);
        storage.addEmployee(employee);
        System.out.println("employee details are stored!");

    }

    public void displayEmpByEmpno() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter emp num to display:");
        int empNo = s.nextInt();

        Employee employee = storage.getEmployee(empNo);
        if(employee != null) {
            System.out.println(employee);
        }
        else {
            System.out.println("employee not found");
        }
    }
}

