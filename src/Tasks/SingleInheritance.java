package Tasks;

public class SingleInheritance {
    public static void main(String[] args) {
        Swati t = new Swati();
        t.speak();   // Inherited from Person
        t.listen();  // Own method
    }
}
class Person {
    void speak() {
        System.out.println("Swati can speak");
    }
}

class Swati extends Person {
    void listen() {
        System.out.println("Swati can listen");
    }
}