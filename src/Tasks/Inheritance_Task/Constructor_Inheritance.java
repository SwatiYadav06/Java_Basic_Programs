package Tasks.Inheritance_Task;

public class Constructor_Inheritance {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.display();
    }
}

class Parent1 {
    Parent1() {
        System.out.println("This is Parent constructor");
    }
void display()
{
    System.out.println("This is Parent display");
}
}

class Child1 extends Parent1 {
    Child1() {
        System.out.println("This is Child constructor");
    }
    void display()
    {
        System.out.println("This is Child display");
    }
}