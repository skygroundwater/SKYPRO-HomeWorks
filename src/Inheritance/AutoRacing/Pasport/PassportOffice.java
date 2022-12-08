package Inheritance.AutoRacing.Pasport;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PassportOffice {
    private final Map<Long, Pasport> pasportMap;
    public PassportOffice(){
        this.pasportMap = new HashMap<>();
    }
    public void addPasport(Long number, String firstname, String lastName, String middleName, LocalDate dateOfBirth){
        Pasport pasport = new Pasport(number, firstname, lastName, middleName, dateOfBirth);
        pasportMap.put(pasport.getNumber(), pasport);
    }
    static class Pasport {
        private Long number;
        private String firstname;
        private String lastName;
        private String middleName;
        private LocalDate dateOfBirth;
        public Pasport(Long number, String firstname, String lastName, String middleName, LocalDate dateOfBirth){
            setFirstname(firstname);
            setLastName(lastName);
            setNumber(number);
            setMiddleName(middleName);
            setDateOfBirth(dateOfBirth);
        }
        public void setLastName(String lastName) {
            if(lastName == null || lastName.isEmpty()) throw new RuntimeException(); else this.lastName = lastName;
        }
        public void setNumber(Long number) {
            if(number == null || String.valueOf(number).length() != 10) throw new RuntimeException(); else this.number = number;
        }
        public void setDateOfBirth(LocalDate dateOfBirth) {
            if(dateOfBirth == null) throw new RuntimeException(); else this.dateOfBirth = dateOfBirth;
        }
        public void setFirstname(String firstname) {
            if(firstname == null || firstname.isEmpty()) throw new RuntimeException(); else this.firstname = firstname;
        }
        public void setMiddleName(String middleName) {
            if(middleName == null || middleName.isEmpty()) throw new RuntimeException(); else this.middleName = middleName;
        }
        public String getLastName() {
            return lastName;
        }
        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }
        public Long getNumber() {
            return number;
        }
        public String getFirstname() {
            return firstname;
        }

        public String getMiddleName() {
            return middleName;
        }
        @Override
        public String toString() {
            return " полное имя " + firstname + lastName + middleName + " дата рождения " + dateOfBirth;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pasport pasport = (Pasport) o;
            return Objects.equals(number, pasport.number) && Objects.equals(firstname, pasport.firstname) && Objects.equals(lastName, pasport.lastName) && Objects.equals(middleName, pasport.middleName) && Objects.equals(dateOfBirth, pasport.dateOfBirth);
        }
        @Override
        public int hashCode() {
            return Objects.hash(number, firstname, lastName, middleName, dateOfBirth);
        }
    }

    public static void main(String[] args) {
        PassportOffice passportOffice = new PassportOffice();
        passportOffice.addPasport(4016689436L, "Олег", "Метелев", "Сергеевич", LocalDate.ofEpochDay(1996- 2 -19));
    }
}
