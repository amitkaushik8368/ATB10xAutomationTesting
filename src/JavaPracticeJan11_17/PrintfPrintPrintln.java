package JavaPracticeJan11_17;

public class PrintfPrintPrintln {
    public static void main(String[] args) {
        int num = 9;
        for(int i=1; i<=10; i++){
            System.out.printf("9 x %d", i);
            System.out.printf(" = %d", num*i);
            System.out.println();
        }
    }
}
