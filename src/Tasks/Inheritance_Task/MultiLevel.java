package Tasks.Inheritance_Task;

public class MultiLevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}

class Grandparent {
    void showGrandparent() {
        System.out.println("I am the Grandparent");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("I am the Parent");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am the Child");
    }
}