package Person;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void talk() {
        System.out.println(this.fullName + " are talking");
    }

    public static void main(String[] args) {
        new Person();
        Person person2 = new Person("Stephen", 20);
        person2.talk();
    }
}
