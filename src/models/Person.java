package models;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,
                  String lastName,
                  int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getFAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.firstName)
                .append(" ")
                .append(this.lastName)
                .append(" ")
                .append(this.age)
                .toString();
    }
}
