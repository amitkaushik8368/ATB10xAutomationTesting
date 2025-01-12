package JavaPracticeJan11_17;

public class VariableTypes {
    static int staticVariable = 19;
    public static void main(String[] args) {
        int x = 10;
        x = 30;
        final int y = 7;   //Cannot be changed once declared
        //y = 8;
        int z = 100;
        System.out.println(staticVariable);
    }
    void sampleMethod(){
        System.out.println("This is a sample method");
    }
}
