package JavaPracticeJan18_24;
/*
Program to replace Vowels with * from the given string
Input "This is Automation Testing Interview"
Output "Th*s *s **t*m*t**n T*st*ng *nt*rv**w"

 */
public class RemoveVowels {
    public static void main(String[] args) {
        String str = "This is Automation Testing Interview";
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char c: vowel){
            str = str.replace(c, '*');
        }
        System.out.println(str);


        String sentence = "I need to practice on more editors";
        String result = sentence.replaceAll("[AEIOUaeiou]", "*");
        System.out.println(result);

    }
}
