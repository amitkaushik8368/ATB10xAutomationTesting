package CodingQuestionsTarget_100;

public class LabNo_025
{
    public static void main(String[] args)
    {

        // This lab will let me understand the relations between character and integer

        char c = 'a';
        int y = 'Z';
        int z = '*';
        char d = 123;

        int x = c-'A';
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println("____" + d);

        for (char i = 0 ; i <= 127; i++)
        {
            int j = i;
            System.out.println(j + "      " + i);
        }


    }
}
