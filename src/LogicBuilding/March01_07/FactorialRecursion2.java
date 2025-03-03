package LogicBuilding.March01_07;

public class FactorialRecursion2
{
    public static void main(String[] args)
    {
        System.out.println(factorial(4));

    }

    static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

}
