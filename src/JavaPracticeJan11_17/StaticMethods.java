package JavaPracticeJan11_17;

public class StaticMethods {
    public static void main(String[] args) {
        StaticMethods sM = new StaticMethods();
        //sampleMethod1();
        //StaticMethods.sampleMethod1();
        sM.sampleMethod1();
        sampleMethod2();
        sM.sampleMethod2();

    }

    void sampleMethod1(){
        System.out.println("This is a sample method");
    }
    static void sampleMethod2(){
        System.out.println("This is another sample method");
    }

}
