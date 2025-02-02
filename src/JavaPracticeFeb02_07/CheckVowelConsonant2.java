package JavaPracticeFeb02_07;

public class CheckVowelConsonant2 {
    public static void main(String[] args) {
        char ch = 'u';
        //boolean entry = false;
        //char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Char is vowel");
        } else System.out.println("Char is consonant");
    }
}
