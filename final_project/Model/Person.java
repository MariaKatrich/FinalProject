package final_project.Model;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person() {
    }

    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getHome() {
        return home;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Person{" + "lastName=" + lastName + ", firstName=" + firstName + ", home=" + home + '}';
    }
}
