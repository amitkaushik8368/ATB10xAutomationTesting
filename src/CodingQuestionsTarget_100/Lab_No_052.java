package CodingQuestionsTarget_100;

public class Lab_No_052
{
    void show(int x) {
        System.out.println("int");
    }
    void show(double x)
    {
        System.out.println("double");
    }

    public static void main(String[] args) {
        Lab_No_052 t = new Lab_No_052();
        t.show(10.5f);   // In method overloading type promotion works like float to double, int to long but the reverse throws compilation error
    }
}
