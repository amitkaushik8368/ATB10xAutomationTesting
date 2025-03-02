package LogicBuilding.March01_07;

public class FactorialRecursion1
{

    public static void main(String[] args)
    {

        System.out.println(factorial(6, 1));

    }

    static int factorial(int num, int fact)
    {

        fact = fact * num;
        System.out.println(num);
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
