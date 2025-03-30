package CodingQuestionsTarget_100;
/*
Write the java program to print first letter of each word in a String
 */
public class LabNo_021
{
    public static void main(String[] args) {

        String input = "Amit Sharma is Improving his programming skills";
        String[] inputArray = input.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (String str : inputArray)
        {
            stringBuilder.append(str.charAt(0));
        }
        System.out.println(stringBuilder);




    }
}
