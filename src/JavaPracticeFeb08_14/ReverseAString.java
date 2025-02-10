package JavaPracticeFeb08_14;

/*
*
* Reverse a String str = "This is an interview"
* String output = "weivretni na si sihT"
*
*
 */

import javax.print.DocFlavor;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "This is an interview";
        StringBuilder output = new StringBuilder();
        for(int i = input.length()-1; i >=0 ; i--)
        {
            output.append(input.charAt(i));
        }
        System.out.println(output);
    }
}
