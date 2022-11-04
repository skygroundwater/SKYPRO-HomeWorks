package pro.skypro.course2.employeeservice.employeeservice.EmployeeService;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface InterfaceForEmployeeService {
    Employee add(String employeeFirstName, String employeeLastName);
    Employee remove(String employeeFirstName, String employeeLastName);
    Employee find(String employeeFirstName, String employeeLastName);
    ArrayList<Employee> showAllEmployees();
}
