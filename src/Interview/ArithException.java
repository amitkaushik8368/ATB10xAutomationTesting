package Interview;

public class ArithException
{
    public static void main(String[] args) {
        int x =10;
        fabonnacci(x);


    }

    static int fabonnacci(int x)
    {
        if (x == 1)
            return 1;
        else if (x==2)
            return 2;


        return fabonnacci(x-1) * fabonnacci(x-2);

    }

}
