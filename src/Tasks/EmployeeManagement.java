package Tasks;

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 101, "Sales");

        // Overloaded Methods
        m1.work();
        m1.work(8);
        m1.work("Annual Report");

        // Overridden Method
        m1.showInfo();

        // Accessing encapsulated data
        System.out.println("Accessing Name: " + m1.getName());
    }
}
    // Base class: Employee
    class Employee {
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // Encapsulation: Getters & Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // Method Overloading (Compile-time Polymorphism)
        public void work() {
            System.out.println("Employee is working.");
        }

        public void work(int hours) {
            System.out.println("Employee worked for " + hours + " hours.");
        }

        // Method to be overridden
        public void showInfo() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
        }
    }

    // Subclass: Manager
    class Manager extends Employee {
        private String department;

        public Manager(String name, int id, String department) {
            super(name, id); // using super
            this.department = department; // using this
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        // Method Overriding (Runtime Polymorphism)
        @Override
        public void showInfo() {
            super.showInfo(); // calling parent method
            System.out.println("Department: " + this.department);
        }

        // Overloading again in subclass
        public void work(String task) {
            System.out.println("Manager is working on: " + task);
        }
    }

