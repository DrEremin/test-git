package models;

public class Person {

    private String firstName;
    private String lastName;
    private String job;
    private int age;

    public Person(String firstName,
                  String lastName,
                  String job,
                  int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJob(String job) {
        this.job = job;
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

    public String getJob() {
        return this.job;
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
