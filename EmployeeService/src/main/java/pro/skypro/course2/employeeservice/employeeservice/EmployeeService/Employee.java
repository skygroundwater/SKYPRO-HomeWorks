package pro.skypro.course2.employeeservice.employeeservice.EmployeeService;

public class Employee{
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){ return lastName;}

    public  boolean equals(Object other){
        if(other == null || this.getClass() != other.getClass()){
            return false;
        }
        if (this == other){
            return true;
        }
        Employee employee = (Employee) other;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }
    public String toString(){
        return firstName + " " + lastName;
    }
    public int hashCode(){
        return java.util.Objects.hash(firstName,lastName);
    }
}

