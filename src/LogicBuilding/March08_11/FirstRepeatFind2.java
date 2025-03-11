package LogicBuilding.March08_11;

public class FirstRepeatFind2 {

    public static void main(String[] args) {
        String input = "naman";
        int[] count = new int[26];
        System.out.println(count[0]);

        // First pass: Count occurrences
        for (char ch : input.toCharArray()) {
            count[ch - 'a']++;
        }
        for (int num:count)
        {
            System.out.print(num + " ");
        }

        // Second pass: Find the first non-repeating character
        for (char ch : input.toCharArray()) {
            if (count[ch - 'a'] == 1) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }


}
