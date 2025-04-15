package CodingQuestionsTarget_100;

public class Lab_No_050
{

    static {
        System.out.println("Static ");
    }

    {
        System.out.println("Instance ");
    }

    Lab_No_050() {
        System.out.println("Constructor ");
    }

    public static void main(String[] args) {
        System.out.println("Before Object Creation");
        Lab_No_050 t = new Lab_No_050();
        /*
        Output :
        1. static -> JVM loads the class and first of all initialize static block and variables
        2. main -> JVM enters the main methods and execute statements in order so, sout will be executed
        3. Instance -> When object is created first memory is allocated and during that time instance variable and blocks are initialized,
                        commons setup for constructors

        4. Constructor -> Then constructor is executed
         */
    }

//    static int x = 10;
//    int y = 10;
//
//    public Lab_No_050()
//    {
//        x++;
//        y++;
//    }
//
//    public static void main(String[] args) {
//
//        Lab_No_050 l1 = new Lab_No_050();
//        Lab_No_050 l2 = new Lab_No_050();
//        Lab_No_050 l3 = new Lab_No_050();
//
//        System.out.println(l3.x + " " + l3.y);
//
//    }



}
