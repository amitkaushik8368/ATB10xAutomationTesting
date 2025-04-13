package CodingQuestionsTarget_100;

public class Lab_No_046
{
    public static void main(String[] args) {

        String input = "GoodMorningGGoodAfternoonGoodNight";
        String wordToReplace = "Good";
        String replaceWith = "Bad";
        int count=0, fromIndex = 0, index = -1;
        System.out.println(input.indexOf(wordToReplace, 4));

        while (count < 3) {
            index = input.indexOf(wordToReplace, fromIndex);

            if (index == -1) {
                System.out.println("Less than 3 occurrences found.");
                return;
            }
            fromIndex = index + wordToReplace.length();
            //System.out.println("Iteration: " + count + " Index : " + index + " FromIndex " + fromIndex);
            count++;
        }
        String output = input.substring(0, index) + replaceWith + input.substring(fromIndex);
        System.out.println(output);

    }
}
