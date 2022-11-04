package pro.skypro.course2.employeeservice.employeeservice.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EmployeeAlreadyAdded extends RuntimeException{
    public EmployeeAlreadyAdded (String description){
        super(description);
    }
}
