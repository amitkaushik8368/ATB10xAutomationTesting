package JavaPracticeFeb08_14;
/*
Make the below Pyramid Pattern

      *
     ***
    *****
   *******
    *****
     ***
      *
 */
public class PyramidPattern6 {
    public static void main(String[] args) {
        int height = 7;
        int parameter = height/2 +1;
        for (int i = 1; i<=2*height; i=i+2)
        {
            if (i<=height)
            {
                System.out.print(" ".repeat(--parameter));
                System.out.println("*".repeat(i));
            } else {
                System.out.print(" ".repeat(parameter++));

            }


        }
    }
}
