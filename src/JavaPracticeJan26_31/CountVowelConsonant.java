package JavaPracticeJan26_31;

//Count vowels and consonants in a String.  "pramod", → vowels - 2, consnants - 4

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String name = "amitsharma";
        int noOfVowels = 0, noOfConsonants = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int len = name.length();
        for (int i=0; i<len ;i++){
            boolean isVowel = false;
            for (char vov: vowels){
                if(name.charAt(i) == vov)
                {
                    noOfVowels++;
                    isVowel = true;
                    continue;
                }
            }
            if (!isVowel)
                noOfConsonants++;
        }
        System.out.println("No of Vowels: " + noOfVowels + "\nNo of  consonants: " + noOfConsonants);
    }
}

