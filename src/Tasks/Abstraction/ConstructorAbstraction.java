package Tasks.Abstraction;

public class ConstructorAbstraction {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

abstract class Shape {
    Shape() {
        System.out.println("Shape constructor called");
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle() {
        System.out.println("Circle constructor called");
    }

    void draw() {
        System.out.println("Drawing Circle");
    }
}