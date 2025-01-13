package JavaPracticeJan11_17;
/*
Program to reverse a String without using builtin functions ex: automation = noitamotua
 */
public class StringLab001 {
    public static void main(String[] args) {
        String str1 = "Automation";
        int l = str1.length();
        String str2 = "";
        for (int i=l-1; i>=0 ; i--){
            str2 = str2+str1.charAt(i);
        }
        System.out.println(str2);

    }
}
