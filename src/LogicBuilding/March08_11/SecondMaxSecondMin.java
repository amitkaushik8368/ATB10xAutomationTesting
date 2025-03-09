package LogicBuilding.March08_11;

public class SecondMaxSecondMin
{
    public static void main(String[] args) {
        int[] array = {3, 4, 7, 1, 9, 9, 2};
        int large, small;
        large=small=array[0];
        int secondLarge, secondSmall;
        secondSmall = secondLarge = 0;
        int y;

        for (int num:array)
        {
            if (num>large)
            {
                secondLarge = large;
                large=num;
            }
            if (num<small) {
                secondSmall = small;
                small = num;

            }
        }
        System.out.println("Large " + large);
        System.out.println("Second Large " + secondLarge);
        System.out.println("Small " + small);
        System.out.println("SecondSmall " + secondSmall);


    }
}
