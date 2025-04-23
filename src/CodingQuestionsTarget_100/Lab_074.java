package CodingQuestionsTarget_100;

public class Lab_074
{
    public static void main(String[] args) {

        //Count the number of digits without String

        int num = 1245224535;
        int i=0;
        while (num!=0)
        {
            num/=10;
            i++;
        }
        System.out.println("Number of digits: " + i);



    }
}
