import models.Person;
import models.Cat;
public class Main {
    public static void main(String[] args) {
        System.out.println("test-git");
        Person person1 = new Person("Иван", "Иванов", 25);
        Cat cat = new Cat("Барсик", 10.5, 4);
        System.out.println(person1 + " & " + cat);
    }
}
