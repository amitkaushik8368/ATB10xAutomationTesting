package CodingQuestionsTarget_100;

public class LabNo_022
{
    public static void main(String[] args) {

        Integer x = 12321;

        String str = String.valueOf(x);

        StringBuilder stringBuilder = new StringBuilder(str);
        String output = stringBuilder.reverse().toString();
        if (str.equals(output)){
            System.out.println("Number is Palindrome");
        } else System.out.println("Number is not Palindrome");

    }
}
