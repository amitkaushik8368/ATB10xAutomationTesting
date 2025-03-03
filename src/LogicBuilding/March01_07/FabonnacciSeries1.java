package LogicBuilding.March01_07;

public class FabonnacciSeries1
{
    public static void main(String[] args)
    {
        /*
        1, 1, 2, 3, 5, 8, 13, 21, 34........
        Input two variables
        Logic x= 1, y =1;
        sout(x + "," + y)
        while(num<10)
        {
            temp = x
            x=x+y
            y=x+y
        }

         */

        int x=1, y=1, n=0;
        while (n<10)
        {

            System.out.print(x + ", " + y + ", ");
            x=x+y;
            y=x+y;
            n++;
        }


    }
}
