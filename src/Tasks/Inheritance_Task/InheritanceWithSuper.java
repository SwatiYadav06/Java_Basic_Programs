package Tasks.Inheritance_Task;

public class InheritanceWithSuper {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.makeSound();
    }
}

class Animal2 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }
}