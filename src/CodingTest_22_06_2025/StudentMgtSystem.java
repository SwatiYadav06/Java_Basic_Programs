package CodingTest_22_06_2025;

public class StudentMgtSystem {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Swati","A");
        Student s2 = new Student(2, "Mansvi","B");

        // Print details
        s1.displayDetails();
        s2.displayDetails();
    }
}

class Student {
    String name;
    int roll;
    String section;

    Student(int roll, String name, String section) {
        this.name = name;
        this.roll = roll;
        this.section=section;
    }

    void displayDetails() {
        System.out.print("Roll No.: " + roll+", ");
        System.out.print("Name: " + name+", ");
        System.out.println("Section: " + section);

    }
}