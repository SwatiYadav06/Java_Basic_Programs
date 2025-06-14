package Tasks.Constructor_Tasks;

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");

        Mobile m2 = new Mobile("iPhone", 89999.99);
        m1.display();
        m2.display();
    }
}

class Mobile {
private String brand;
private double price;

Mobile(String brand) {
    this.brand = brand;
}

Mobile(String brand, double price) {
    this.brand = brand;
    this.price = price;
}

void display() {
    System.out.println("Brand : " + brand);
    System.out.println("Price: " + price);
    System.out.println(" ");
}
}
