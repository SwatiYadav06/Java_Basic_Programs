package Tasks.Inheritance_Task;

public class OverridingWithInheritance {
    public static void main(String[] args) {

        Dog1 d = new Dog1();
        d.makeSound();
    }
}
class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}