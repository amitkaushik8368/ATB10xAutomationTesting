package CodingQuestionsTarget_100;

public class Lab_No_048
{
    public static void main(String[] args) {

        //WAP to segregate alphabets, digits and special charaters from a given String

        String str = "P@s5C#aN63@?26tw";
        StringBuilder alphabets = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        for (char ch : str.toCharArray())
        {
            if (Character.isAlphabetic(ch))
                alphabets.append(ch);
            else if (Character.isDigit(ch))
                digits.append(ch);
            else specialCharacters.append(ch);
        }
        System.out.println(alphabets);
        System.out.println(digits);
        System.out.println(specialCharacters);
    }
}
