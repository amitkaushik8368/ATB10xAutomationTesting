package CodingQuestionsTarget_100;

import java.util.ArrayList;

/*

Find the longest substring from a string
Example -> input = "rebecca" output = "ebe"
 */
public class LabNo_005
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String input = "rebecca";

        for (int i=0; i<input.length();i++)
        {
            for(int j=input.length()-1; j>i; j--)
            {
                System.out.println(i + " " + j);
                System.out.println("__________________");
                if (input.charAt(i) == input.charAt(j))
                {
                    System.out.println(i + " " + j);


                        arrayList.add(i);
                        arrayList.add(j);



                }
            }
        }
        System.out.println(arrayList);

    }
}
