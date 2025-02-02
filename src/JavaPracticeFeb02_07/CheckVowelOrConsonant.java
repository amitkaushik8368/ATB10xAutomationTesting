package JavaPracticeFeb02_07;
//check if the char is vowel or consonant
public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        //char ch = 65;
        char ch1 = 'd';
        boolean entry = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char vowel:vowels){
            if (ch1 == vowel) {
                System.out.println("Char is vowel");
                entry = true;
                break;
            }
        }
        if (!entry){
            System.out.println("Char is consonant");
        }
    }
}
