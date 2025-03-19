package CodingQuestionsTarget_100;
/*
Check whether a string is palindrome or not
 */
public class LabNo_003
{
    public static void main(String[] args) {

        String input = "namana";
        char[] inputArray = input.toCharArray();
        int low = 0, high = inputArray.length-1;
        while(low<high)
        {
            if (inputArray[low++] != inputArray[high--])
            {
                System.out.println("Not a palindrome String");
                return;
            }
        }
        System.out.println("String is palindrome");

    }
}
