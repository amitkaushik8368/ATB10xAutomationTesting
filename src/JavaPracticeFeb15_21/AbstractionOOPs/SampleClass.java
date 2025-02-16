package JavaPracticeFeb15_21.AbstractionOOPs;

public class SampleClass
{
    public static void main(String[] args) {

    }
}

class Sharma extends Amit{
    int age = 27;
//    @Override
//    void abstractMethod() {
//        System.out.println("This is abstract method implementation of abstract class in concrete class");
//    }

    @Override
    void abstractMethodSharmaClass() {
        System.out.println("This is abstract method implementation of abstract class in concrete class");
    }

    void concreteMethodSharma()
    {
        System.out.println("This is concrete method in concrete class");
    }
}

abstract class Amit
{
    int age = 54;


    abstract void abstractMethodSharmaClass();

    void concreteMethodAmit()
    {
        System.out.println("This is a concrete method in abstract class");
    }

}
