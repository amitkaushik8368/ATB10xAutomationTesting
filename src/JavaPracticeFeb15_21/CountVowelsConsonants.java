package JavaPracticeFeb15_21;
/*
This program is to replace vowels with consonants
 */
public class CountVowelsConsonants
{
    public static void main(String[] args)
    {
        String str = "Amit Sharma has to change his job";
        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr);
        System.out.println(lowerStr.replaceAll("[aeiou]", "*"));
//        char[] chArray = {'a', 'e', 'i', 'o', 'u'};
//        for (char ch: chArray)
//        {
//            lowerStr = lowerStr.replace(ch, '*');
//        }
//
//        System.out.println(lowerStr);

    }
}
