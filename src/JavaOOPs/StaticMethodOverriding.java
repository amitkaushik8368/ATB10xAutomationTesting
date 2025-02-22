package JavaOOPs;

public class StaticMethodOverriding
{
    public static void main(String[] args) {

    }
}

class PostMan
{
    static void message()
    {
        System.out.println("This is a static method");
    }
}

class Insomnia extends PostMan
{
    //void message()    //message() in JavaOOPs.Insomnia cannot override message() in JavaOOPs.PostMan   overridden method is static
//    {
//        System.out.println("I am overriding static method");
//    }
}