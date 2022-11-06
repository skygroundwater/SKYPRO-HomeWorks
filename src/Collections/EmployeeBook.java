package Collections;
import java.util.*;
public class EmployeeBook {
    private final Map<String, Employee> employees;
    private EmployeeBook(Map<String, Employee> employees) {
        this.employees = employees;
    }
    EmployeeBook(){
        this.employees = new HashMap<>();
    }
    public void addEmployee(String fullName, String department, int salary) {
        Employee employee = new Employee(fullName,department,salary);
        employees.put(employee.getFullName(), employee);
    }
    public void removeEmployee(String fullName){
        employees.remove(fullName);
    }
    private Set<String> getSetForKeyOfEmployees(){
        return employees.keySet();
    }
    private Set<Double> getSetForSalaries(){
        Set<Double> salaries = new HashSet<>();
        for (String key: getSetForKeyOfEmployees()){
            salaries.add(employees.get(key).getSalary());
        }
        return salaries;
    }
    private Set<Double> getSetForSalariesOfDepartment(String department){
        Set<Double> salariesOfDepartment = new HashSet<>();
        for(String key: getSetForKeyOfEmployees()){
            if(department.equals(employees.get(key).getDepartment())){
                salariesOfDepartment.add(employees.get(key).getSalary());
            }
        }
        return salariesOfDepartment;
    }
    public double getSumOfSalaries() {
        int sum = 0;
        for (String key: getSetForKeyOfEmployees()) {
            sum += employees.get(key).getSalary();
        }
        return sum;
    }
    public double getSumSalariesOfDepartment(String department) {
        double sum = 0;
        for (Double salaries: getSetForSalariesOfDepartment(department)){
            sum += salaries;
        }
        return sum;
    }
    public double findMaxSalary(){
        double maxSalary = Double.NEGATIVE_INFINITY;
        for (String key: getSetForKeyOfEmployees()){
            if(maxSalary < employees.get(key).getSalary()){
                maxSalary = employees.get(key).getSalary();
            }
        }
        return maxSalary;
    }
    public double findMinSalary() {
        double minSalary = Double.POSITIVE_INFINITY;
        for (String key: getSetForKeyOfEmployees()){
            if(minSalary > employees.get(key).getSalary()){
                minSalary = employees.get(key).getSalary();
            }
        }
        return minSalary;
    }
    public double findMaxSalaryOfDepartment(String department){
        double maxSalary = Double.NEGATIVE_INFINITY;
        for (Double salaries: getSetForSalariesOfDepartment(department)){
            if(maxSalary < salaries){
                maxSalary = salaries;
            }
        }
        return maxSalary;
    }
    public double findMinSalaryOfDepartment(String department) {
        double minSalary = Double.POSITIVE_INFINITY;
        for (Double salaries: getSetForSalariesOfDepartment(department)){
            if(minSalary > salaries){
                minSalary = salaries;
            }
        }
        return minSalary;
    }
    public void indexSalaries(double index) {
        index = index/100+1;
        for (String key: getSetForKeyOfEmployees()) {
            employees.get(key).setSalary(employees.get(key).getSalary()*index);
        }
    }
    public void indexDepartmentSalaries(String department, double index) {
        index = index / 100 + 1;
        for (String key : getSetForKeyOfEmployees()) {
            if (department.equals(employees.get(key).getDepartment())) {
                employees.get(key).setSalary(employees.get(key).getSalary() * index);
            }
        }
    }
    public void changeSalaryForEmployee(String fullName, double newSalary){
        employees.get(fullName).setSalary(newSalary);
            }
    public void changeDepartmentForEmployee(String fullName, String newDepartmentForEmployee) {
        employees.get(fullName).setDepartment(newDepartmentForEmployee);
    }
    public void findSalariesIfSalaryLessThanNumber(int number) {
        for (Double salaries : getSetForSalaries()) {
            if (salaries < number) {
                System.out.println(salaries);
            }
        }
    }
    public void findSalariesIfSalaryMoreThanNumber(int number){
        for (Double salaries : getSetForSalaries()) {
            if (salaries > number) {
                System.out.println(salaries);
            }
        }
    }
    public double getAverageSalary(){
        return getSumOfSalaries()/employees.size();
    }
    public double getAverageSalaryOfDepartment(String department) {
        return getSumSalariesOfDepartment(department)/getSetForSalariesOfDepartment(department).size();
    }
    public void showNamesOfEmployees(){
        for (String key: getSetForKeyOfEmployees()){
            System.out.println(employees.get(key).getFullName());
        }
    }
    public void showNamesOfEmployeesFromDepartment(String department){
        for (String key: getSetForKeyOfEmployees()){
            if(department.equals(employees.get(key).getDepartment())) {
                System.out.println(employees.get(key).getFullName());
            }
        }
    }
    public void getAllInfoAboutEmployees() {
        for (String key: getSetForKeyOfEmployees()) {
            System.out.println(employees.get(key));
        }
    }
    public void getAllInfoAboutEmployeesFromDepartment(String department){
        for (String key: getSetForKeyOfEmployees()) {
            if (department.equals(employees.get(key).getDepartment())) {
                System.out.println(employees.get(key));
            }
        }
    }
    @Override
    public String toString(){
        return employees.toString();
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(employees);
    }
    @Override
    public boolean equals(Object other){
        if(other == null || this.getClass() != other.getClass()){
            return  false;
        }
        if(this == other) {
            return true;
        }
        EmployeeBook employeeBook = (EmployeeBook) other;
        return employees.equals(employeeBook.employees);
    }
}