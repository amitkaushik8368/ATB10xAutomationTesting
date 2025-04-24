package LogicBuilding;

public class April_22
{
    /*
    int num = 123;
    int reverseNum = 321
     */

    public static void main(String[] args)
    {
        int num = 123;
        int reverse = 0;
        while (num!=0)
        {
            int digit = num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }
        System.out.println(reverse);

        


    }
}
