package LogicBuilding.March08_11;

public class MaximumMinimum
{
    public static void main(String[] args) {
        int[] array = {3, 4, 7, 1, 9, 2};
        int maxNum = array[0];
        int minNum = array[0];

        for(int num: array)
        {
            if (num>maxNum)
                maxNum=num;
            else if (num<minNum)
                minNum=num;
        }
        System.out.println("Max Number " + maxNum );
        System.out.println("Min Number " + minNum);
    }
}
