package JavaPracticeJan11_17;

public class FinallyKeyword {
    public static void main(String[] args) {
        try {
            int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception" + e.getMessage());
            return;

        } finally {
            System.out.println("This is finally block this will always execute irrespective of any statement i.e. return");
            System.out.println("This is used for operations that has to be performed without fail like db connection close");
        }
    }
}
