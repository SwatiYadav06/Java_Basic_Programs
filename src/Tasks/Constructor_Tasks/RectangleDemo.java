package Tasks.Constructor_Tasks;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 5.0);
        rect.printArea();
    }
}

class Rectangle {
     double length;
     double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}