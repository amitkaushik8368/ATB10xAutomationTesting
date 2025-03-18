package LogicBuilding.March18_21;

/*
Given array {6, 8, 11, 6, 7, 18}
Target sum = 17, find indices of any two numbers whose sum give 17
 */

public class FindArrayIndexes
{
    public static void main(String[] args) {
        int[] array = {6, 8, 11, 6, 7, 18};
        System.out.println("Below are all possible pair of indices that are giving the sum 17");
        for (int i=0; i<array.length;i++)
        {
            for (int j=i+1; j<array.length; j++)
            {
                if (array[i] + array[j] == 17)
                {
                    System.out.printf("Index %d & %d\n", i, j);
                    return;

                }
            }
        }


    }
}
