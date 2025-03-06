package LogicBuilding.March01_07;

public class PalindromeArray
{
    public static void main(String[] args) {
        /*
        Write a program to check if an Array is a palindrome Array
         */


        int[] array = {1, 1, 1};

        int begin = 0, end = array.length-1;
        while (begin<end)
        {
            if (array[begin++] != array[end--])
            {
                System.out.println("Array is not palindrome");
                System.exit(0);
            }
        }
        System.out.println("Array is a palindrome");


    }
}
