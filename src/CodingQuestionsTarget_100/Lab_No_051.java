package CodingQuestionsTarget_100;

public class Lab_No_051
{
    static {
        System.out.println("Static Block.");
    }

    {
        System.out.println("Instance Block.");
    }

    Lab_No_051() {
        System.out.println("Constructor ");
    }

    public static void main(String[] args) {
        System.out.println("Before Object Creation");
        Lab_No_051 t = new Lab_No_051();
        /*
        Output :
        1. static -> JVM loads the class and first of all initialize static block and variables
        2. main -> JVM enters the main methods and execute statements in order so, sout will be executed
        3. Instance -> When object is created first memory is allocated and during that time instance variable and blocks are initialized,
                        commons setup for constructors

        4. Constructor -> Then constructor is executed
         */
    }
}
