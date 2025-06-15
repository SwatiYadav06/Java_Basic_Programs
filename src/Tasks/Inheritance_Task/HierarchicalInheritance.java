package Tasks.Inheritance_Task;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();      // Inherited method
        c.car();   // Car's own method

        System.out.println(" ");

        Bike b = new Bike();
        b.start();     // Inherited method
        b.bike();  // Bike's own method
    }
}
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void car() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void bike() {
        System.out.println("Bike is riding");
    }
}