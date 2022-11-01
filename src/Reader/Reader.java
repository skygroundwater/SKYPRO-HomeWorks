package Reader;

import java.util.Objects;

public class Reader {
    private String fullName;
    private int numberOfReader;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int numberOfReader, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.numberOfReader = numberOfReader;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String toString() {
        return this.fullName + numberOfReader + faculty + dateOfBirth + phoneNumber;
    }

    public int hashCode() {
        return Objects.hash(fullName, numberOfReader, faculty, dateOfBirth, phoneNumber);
    }

    public boolean equals(Object other) {
        if (other != null && this.getClass() == other.getClass()) {
            if (this == other) {
                return true;
            } else {
                Reader reader = (Reader)other;
                return fullName.equals(reader.fullName) && faculty.equals(reader.faculty) && numberOfReader == reader.numberOfReader && phoneNumber.equals(reader.phoneNumber) && dateOfBirth.equals(reader.dateOfBirth);
            }
        } else {
            return false;
        }
    }
}
