package CodingQuestionsTarget_100;

public class LabNo_034
{
    public static void main(String[] args) {

        System.out.println("Before Thread Sleep: ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After Thread Sleep");

    }
}
