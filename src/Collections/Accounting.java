package Collections;
public class Accounting {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Duravkin Alexey", "Officers", 134000);
        employeeBook.addEmployee("Metelev Oleg", "Officers", 124500);
        employeeBook.addEmployee("Fedorov Maxim", "Chief officers", 118350);
        employeeBook.addEmployee("Vityuk Grigoriy", "Chief officers", 104800);
        employeeBook.addEmployee("Kurish Victor", "Deck", 96700);
        employeeBook.addEmployee("Davitadze Tariel", "Deck", 91300);
        employeeBook.addEmployee("Kashirskiy Sergey", "Engineering", 109700);
        employeeBook.addEmployee("Gorchakov Aleksandr", "Engineering", 102800);
        employeeBook.addEmployee("Nekrasov Dmitriy", "Engine room", 100300);
        employeeBook.addEmployee("Govorov Aleksandr", "Engine room", 98600);
        employeeBook.getAllInfoAboutEmployees();
    }
}
