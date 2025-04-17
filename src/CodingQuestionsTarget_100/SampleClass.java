package CodingQuestionsTarget_100;

public class SampleClass
{
    void sum(int x, int y)
    {
        System.out.println("Sum = " + (x+y));
    }

    static void sum(int x, int y , int z)
    {
        System.out.println("Sum = " + (x+y+z));
    }

    public static void main(String[] args) {
        //sum(2, 3);
        sum(2, 3, 4);
    }
}
