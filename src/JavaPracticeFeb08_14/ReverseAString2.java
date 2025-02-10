package JavaPracticeFeb08_14;

public class ReverseAString2 {
    public static void main(String[] args) {
        String input = "Amit is an Automation Developer";
        StringBuilder output = new StringBuilder(input);
        output.reverse();
        System.out.println(output);
    }
}
