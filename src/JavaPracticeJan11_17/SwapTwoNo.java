package JavaPracticeJan11_17;
/*
Swap two numbers without using the third number
 */
public class SwapTwoNo {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x: " + x + ",y: " + y);
    }
}
