package CodingTest_22_06_2025;

public class AnimalSoundPolymorphism {
    public static void main(String[] args) {
        Animal d1=new Dog();
        d1.makesound();

        Animal c1=new Cat();
        c1.makesound();
    }
}
class Animal
{
    void makesound()
    {
        System.out.println("Animal makes sound");
    }

}
class Dog extends Animal
{
    @Override
    void makesound() {
       System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    @Override
    void makesound() {
        System.out.println("Cat meows");
    }
}