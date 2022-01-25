package models;

public class Cat {
    private String name;
    private double weight;
    private int age;

    public Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.name)
                .append(" ")
                .append(this.weight)
                .append(" ")
                .append(this.age)
                .toString();
    }

}
