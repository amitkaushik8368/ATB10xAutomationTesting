package JavaOOPs;

class Animal
{
    void sound()
    {
        System.out.println("Animals make sound");
    }
    void animalMethod()
    {
        System.out.println("This is Animal method");
    }
}

class Dog extends Animal
{
    @Override
    void sound() {
        System.out.println("Dogs bark");
    }

    void dogMethod()
    {
        System.out.println("This is dog method");
    }
}


public class MethodOverriding
{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animal_1 = new Dog();

        animal.sound();
        dog.sound();
        animal_1.sound();

        animal.animalMethod();
        animal_1.animalMethod();
        dog.animalMethod();

        dog.dogMethod();
        // animal.dogMethod();     not possible
        //animal_1.dogMethod();      not possible

    }

}
