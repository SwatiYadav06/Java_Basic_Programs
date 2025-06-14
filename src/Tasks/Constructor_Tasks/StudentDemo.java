package Tasks.Constructor_Tasks;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);

        s1.display();
    }
}

class Student {

    public String name;
    public int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
