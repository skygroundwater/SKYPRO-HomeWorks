package pro.skypro.course2.employeeservice.employeeservice.EmployeeService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pro.skypro.course2.employeeservice.employeeservice.Exceptions.EmployeeNotFound;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements InterfaceForEmployeeService {
    private final ArrayList<Employee> employees;
    private EmployeeService() {
        employees = new ArrayList<>();
    }
@Override
    public Employee add(String employeeFirstName, String employeeLastName) {
        Employee employee = new Employee(employeeFirstName, employeeLastName);
        employees.add(employee);
        return employee;
    }
@Override
    public Employee remove(String employeeFirstName, String employeeLastName) {
        Employee employee = new Employee(employeeFirstName, employeeLastName);
        if (employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        }else {
            throw new EmployeeNotFound("Employee is not found");
        }
    }
@Override
    public Employee find(String employeeFirstName, String employeeLastName){
        Employee employee = new Employee(employeeFirstName, employeeLastName);
        if (employees.contains(employee)) {
            return employee;
        }else {
            throw new EmployeeNotFound("Employee is not found");
        }
    }
    @Override
    public ArrayList<Employee> showAllEmployees(){
        return employees;
    }
}