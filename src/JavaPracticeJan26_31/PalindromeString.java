package JavaPracticeJan26_31;

/*
Program to check if a String is Palindrome or TypeNotPresentException
Palindrome String = 'naman' if reversed same will Come
Non-Palindrome = "hello"

Logic Building
Input -> String, Ouput-> Check and Print
Rough Logic:
String name  = "naman"
StringBuilder str = ""; for(i = str.len -1 ; i>=0 i++){str.append(name.charAt(i))
        if(name.equal(str)) -> String is Palindrome else not Palindrom
*/

public class PalindromeString {
    public static void main(String[] args) {
        String name = "Naman";
        StringBuilder result = new StringBuilder();
        int len = name.length();
        for (int i = len-1;i>=0 ; i-- ){
            result = result.append(name.charAt(i));
        }
        String result1 = result.toString();
        if(name.toLowerCase().replaceAll(" ", "").equals(result1.toLowerCase().replaceAll(" ", "")))
        {
            System.out.println("String is Palindrome");
        }
        else System.out.println("String is not Palindrome");
    }
}
