package CodingTest_22_06_2025;

public class PersonClassImplementation {
    public static void main(String[] args) {
        Person p1 = new Person("Swati", 25);
        Person p2 = new Person("Sandip", 30);

        // Print details
        p1.displayDetails();
        p2.displayDetails();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.print("Name: " + name+", ");
        System.out.println("Age: " + age);
    }
}