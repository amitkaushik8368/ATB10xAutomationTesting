package LogicBuilding.March18_21;

public class Singleton
{
    private static Singleton singletonInstance;
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if (singletonInstance == null)
            singletonInstance = new Singleton();

        return singletonInstance;
    }

    public void singletonMethod()

    {
        System.out.println("This is Singleton class method");
    }


}
