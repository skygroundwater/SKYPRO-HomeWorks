package pro.skypro.course2.employeeservice.employeeservice.Controller;

import org.springframework.web.bind.annotation.*;
import pro.skypro.course2.employeeservice.employeeservice.EmployeeService.Employee;
import pro.skypro.course2.employeeservice.employeeservice.EmployeeService.EmployeeService;
import pro.skypro.course2.employeeservice.employeeservice.Exceptions.EmployeeNotFound;

import java.util.ArrayList;

@RestController
@RequestMapping("/employee")
public class EmplServController {
    private final EmployeeService employeeService;

    public EmplServController( EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String employeeFirstName, @RequestParam String employeeLastName){
       return employeeService.add(employeeFirstName,employeeLastName);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String employeeFirstName, @RequestParam String employeeLastName){
       return employeeService.remove(employeeFirstName,employeeLastName);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String employeeFirstName,@RequestParam String employeeLastName){
       return employeeService.find(employeeFirstName,employeeLastName);
    }
    @GetMapping()
    public ArrayList<Employee> showAllEmployees(){
        return employeeService.showAllEmployees();
    }
}
