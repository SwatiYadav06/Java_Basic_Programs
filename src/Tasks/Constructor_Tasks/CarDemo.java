package Tasks.Constructor_Tasks;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2450000.00);

        car1.display();
    }
}

class Car {
    private String brand;
    private double price;

    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: ₹" + price);
    }
}