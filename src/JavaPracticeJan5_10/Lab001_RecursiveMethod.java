package JavaPracticeJan5_10;
/*
*This is infinite recursive method
 */

public class Lab001_RecursiveMethod {
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        System.out.println("This is a recursive method");
        recursive();
    }
}
