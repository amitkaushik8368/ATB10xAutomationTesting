package LogicBuilding.Feb22_28;
/*
Remove duplicate characters from a String
Input = "hippopotamus"  Output = "hipotamus"
 */
public class RemoveDuplicateCharString
{
    public static void main(String[] args) {


        String input = "hippopotamus";
        boolean [] decision = new boolean[input.length()];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i< input.length(); i++)
        {
            if (decision[i])continue;
            stringBuilder.append(input.charAt(i));
            for (int j = i+1; j<input.length(); j++)
            {
                if (input.charAt(i) == input.charAt(j))
                {
                    decision[j] = true;
                }
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("Output : " + stringBuilder);

    }
}
