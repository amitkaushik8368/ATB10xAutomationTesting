package JavaPracticeJan18_24;
/*
Maximum among three numbers using ternary operator
 */
public class MaximumAmongThree {
    public static void main(String[] args) {
        int x = 45, y = 12, z = 34;
        int max = x>y?x>z? x:z: y>z? y:z;
        System.out.println(max);
    }
}
