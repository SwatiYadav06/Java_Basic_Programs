package Tasks.Inheritance_Task;

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}