package JavaPracticeJan26_31;

public class BreakContinue {
    public static void main(String[] args) {
        int count = 0, count1 = 0, count2 = 0;
        for (int i=0; i< 10; i++){
            count++;
            break;
        }
        for (int j=0; j< 10; j++){
            count1++;

            if(j > 5) continue;
            count2++;
            System.out.println(count2 + " j: " + j);
        }
        System.out.println("Count2 " + count2);

        System.out.println("Iterations using Break " + count);
        System.out.println("Iterations using continue " + count1);
    }
}
