package JavaOOPs;

public class ExecutionAndNonExecutionClass {

    int age;
    static int rollNo;
    ExecutionAndNonExecutionClass ex = new ExecutionAndNonExecutionClass();
    void method(){
        System.out.println("This method can only be called through the object of the class");
    }

    static void method2()
    {
        System.out.println("This method can be called with or without creating object of the class");
    }

    public static void main(String[] args) {
        ExecutionAndNonExecutionClass class1 = new ExecutionAndNonExecutionClass();
//        class1.age = 10;
//        rollNo = 7;
//        System.out.println(class1.age);
//        System.out.println(rollNo);
//
//        System.out.println("*******************");
//
//        method2();
//       // method();   throws Error
//
//        class1.method();
//        class1.method2();
//
//

    }
}
