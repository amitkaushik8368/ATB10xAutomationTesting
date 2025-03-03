package LogicBuilding.March01_07;

public class FactorialRecursion
{
    public static void main(String[] args)
    {
        int num = 17;
        int factorial = 1;
        while (num>0)
        {
            factorial = factorial*num--;

        }
        System.out.println(factorial);
    }

}
