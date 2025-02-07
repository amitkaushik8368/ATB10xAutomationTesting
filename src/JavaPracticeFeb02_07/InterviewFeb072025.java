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
        String input = "Amit Sharma is an Automation Tester";
        boolean[] decide = new boolean[input.length()];
        int len = input.length();
        for (int i =0; i<len; i++)
        {
            if (decide[i]) continue;
            char count ='1';
            for (int j = i+1; j < len; j++)
            {
                if (input.toLowerCase().charAt(i) == input.toLowerCase().charAt(j))
                {
                    count++;
                    decide[j] = true;
                }
            }

            input = input.replace(input.charAt(i), count);

        }
        System.out.println(input);

    }
}
