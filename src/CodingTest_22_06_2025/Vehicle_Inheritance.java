package CodingTest_22_06_2025;

import Ex_18_OOPs_Constructor.Car;

public class Vehicle_Inheritance {
    public static void main(String[] args) {
    Vehicle c1=new car();
    c1.start();

    Vehicle b1=new Bike();
    b1.start();
    }
}

class Vehicle
{
  void start()
    {
        System.out.println("Vehicle starts");
    }
}

class car extends Vehicle
{
    @Override
    void start() {
        System.out.println("Car starts");
    }
}
class Bike extends Vehicle
{
    @Override
    void start() {
        System.out.println("Bike starts");
    }
}
