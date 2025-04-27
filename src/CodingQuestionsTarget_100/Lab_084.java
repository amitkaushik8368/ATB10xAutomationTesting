package CodingQuestionsTarget_100;

public class Lab_084
{
    public static void main(String[] args) {

        /*

        * *
         *
        * *
         *
        * *


         */

        for (int i = 0; i < 5 ; i++)
        {
            for (int j=0; j< 3 ; j++)
            {
                if (j%2 == 0 && i%2==0)
                    System.out.print("*");
                else if(i%2!=0 && j%2 != 0)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
