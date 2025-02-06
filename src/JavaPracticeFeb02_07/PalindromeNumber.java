package JavaPracticeFeb02_07;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 1226;
        String numS= Integer.toString(num);
        StringBuilder palin = new StringBuilder();
        for (int i = numS.length()-1; i >=0 ; i--) {
            palin.append(numS.charAt(i));
        }
        String numS2 = palin.toString();
        if (numS.equals(numS2)){
            System.out.println("Number is Palindrome");
        }
        else System.out.println("Number is not Palindrome");
    }
}
