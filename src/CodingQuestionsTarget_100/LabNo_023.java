package CodingQuestionsTarget_100;

public class LabNo_023
{
    public static void main(String[] args) {

        int x = 12321;

        int reverse = 0;
        System.out.println(12321%100000);

        for (int i = 10; i<x; i = i*10)
        {
            System.out.println(i);
            System.out.println(x%i);
            reverse = reverse+ (x%i);
        }

        //
        //
        //
        // System.out.println(reverse);

    }
}
