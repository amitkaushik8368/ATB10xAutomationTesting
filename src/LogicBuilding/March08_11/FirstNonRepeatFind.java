package LogicBuilding.March08_11;

public class FirstNonRepeatFind
{
    public static void main(String[] args) {
        String input = "naman";
        char[] ch = input.toCharArray();


        for (int i = 0; i< ch.length; i++){
            boolean decide = false;

            for (int j = i+1; j<ch.length; j++)
            {
                if (ch[i] == ch[j])
                {
                    decide = true;
                }
            }
            if (!decide)
            {
                System.out.println(ch[i]);
                System.exit(0);
            }

        }

    }
}
