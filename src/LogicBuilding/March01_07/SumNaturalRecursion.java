package LogicBuilding.March01_07;

public class SumNaturalRecursion
{
    public static void main(String[] args)
    {

        System.out.println(sumNatural(6));

    }

    static int sumNatural(int x)
    {
        if (x ==0)
            return 0;
        else
            return x+sumNatural(--x);


    }
}
