package JavaPracticeJan18_24;

public class MaxAmgThreeUsingCLI_Input {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int max = x>y?x>z?x:z:y>z?y:z;
        System.out.println(max);

    }
}
