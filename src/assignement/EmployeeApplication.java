package assignement;

import assignement.entity.Employee;
import assignement.service.Operations;

import java.sql.SQLException;

public class EmployeeApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Operations operation = new Operations();
        int task = 5;
        switch (task) {
            case 1: //insert
                Employee employee = new Employee();
                employee.setId(101);
                employee.setLastName("Khatri");
                employee.setFirstName("Tekendra");
                employee.setEmail("t@14");
                employee.setPhone("19455234");
                employee.setSalary(5000);
                employee.setAddress("kupondol");
                employee.setAge(24);
                employee.setDesignation("Intern");
                operation.insert(employee);
                break;
            case 2:
                operation.readAll();
                break;
            case 3:
                operation.readOne(101);
                break;
            case 4:
                operation.update();
                break;
            case 5:
                operation.delete(100);
                break;
            default:
                System.out.println("Request invalid");
        }
    }
}
