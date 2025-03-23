package CodingQuestionsTarget_100;
/*
Write a program to sum only the integer values in a String and print output

input = "Automation1234testing"
output = "Automation10testing"



 */
public class LabNo_014
{
    public static void main(String[] args)
    {
        String input = "Automation123testing";
        char[] array = input.toCharArray();
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<array.length; i++)
        {
            if (array[i]-65 < 0)
            {
                sum = sum + Character.getNumericValue(array[i]);
                if (array[i+1] -65 >= 0)
                    stringBuilder.append(sum);
                continue;
            }
            stringBuilder.append(array[i]);

        }

        System.out.println(stringBuilder);
    }
}
