package CodingQuestionsTarget_100;
//check whether String is palindrome using StringBuilder
public class LabNo_004
{
    public static void main(String[] args) {

        String input = "papapp";
        StringBuilder obj1 = new StringBuilder(input);
        obj1.reverse();
        if (obj1.toString().equals(input))
        {
            System.out.println("String is Palindrome");
        }
        else System.out.println("String is not Palindrome");





    }
}
