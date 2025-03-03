package LogicBuilding.March01_07;

public class FactorialRecursion1
{

    public static void main(String[] args)
    {  factorial(4, 1);
    }
    static int factorial(int num, int fact)
    {
        System.out.printf("%d*%d\n",num,fact);
        fact = fact * num;
        if (num==1)
        {
            System.out.println("Inside If");
            return fact;
        }
        System.out.println("Factorial " + factorial(--num, fact));
        System.out.println("After factorial statement");

        return 0;
    }
}
