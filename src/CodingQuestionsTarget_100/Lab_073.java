package CodingQuestionsTarget_100;

public class Lab_073
{
    //Check if the number is palindrome without using String class

    public static void main(String[] args)
    {

        int x = 12322;
        int y=x;
        int reverse = 0;

        while (x!=0)
        {

            int mod = x%10;
            reverse = reverse*10 + mod;
            x/=10;

        }
        if (y == reverse)
            System.out.println("Number is Palindrome");
        else System.out.println("Number is not Palindrome");


    }

}
