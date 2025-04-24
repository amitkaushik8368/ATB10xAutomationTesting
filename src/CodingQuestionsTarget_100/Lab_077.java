package CodingQuestionsTarget_100;

public class Lab_077
{
    public static void main(String[] args) {

        int i=0, num=0;

        while (i<5)
        {
            num = (++i*i++*2+1);
            System.out.println(num);
        }


    }
}
