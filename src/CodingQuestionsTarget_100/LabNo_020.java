package CodingQuestionsTarget_100;
/*
Write the java program to print first letter of each word in a String
 */
public class LabNo_020
{
    public static void main(String[] args) {

        String input = "Amit Sharma is Improving his programming skills";
        String[] inputArray = input.split(" ");
        char[] firstElement = new char[inputArray.length];
        int i=0;

        for (String str: inputArray)
            firstElement[i++] = str.charAt(0);

        System.out.println(firstElement);


    }
}
