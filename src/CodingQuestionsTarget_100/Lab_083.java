package CodingQuestionsTarget_100;

public class Lab_083
{
    public static void main(String[] args)
    {
        /*

        1
        2 3
        4
        5 6
        7

         */
        int n = 1;

        for (int i = 0; i< 5 ; i++)
        {
            if (i%2 !=0)
                System.out.println(n++ + " " + n++);

            else
                System.out.println(n++);
        }


    }
}
