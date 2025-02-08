package JavaPracticeFeb02_07;
/*
 *Given a String = "amit sharma"
 * Logic -> Count each character occurrence and replace it the number of times it occurred
 * Output => "3211 113123"
 *
 *
 */

public class InterviewFeb072025 {
    public static void main(String[] args) {
        String input = "banana**";
        String lowerInput = input.toLowerCase();
        System.out.println(lowerInput);
        boolean[] decide = new boolean[input.length()];
        int len = input.length();
        for (int i =0; i<len; i++)
        {
            if(lowerInput.charAt(i) == ' ')continue;
            if (decide[i]) continue;
            char count ='1';

            for (int j = i+1; j < len; j++)
            {
                if (lowerInput.charAt(i) == lowerInput.charAt(j))
                {
                    count++;
                    decide[j] = true;
                }
            }

            lowerInput = lowerInput.replace(lowerInput.charAt(i), count);

        }
        System.out.println(lowerInput);

    }
}
