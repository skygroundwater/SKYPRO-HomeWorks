package pro.skypro.course2.employeeservice.employeeservice.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import pro.skypro.course2.employeeservice.employeeservice.EmployeeService.Employee;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends RuntimeException {
    public EmployeeNotFound(String description){
        super(description);
    }
}
