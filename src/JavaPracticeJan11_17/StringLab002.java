package JavaPracticeJan11_17;

public class StringLab002 {
    public static void main(String[] args) {
        String str1 = "This is a new String";
        String[] separate = str1.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (int i = separate.length-1; i>=0; i--){
            
            reverseString.append(separate[i]).append(" ");
        }
        System.out.println(reverseString);
    }
}
